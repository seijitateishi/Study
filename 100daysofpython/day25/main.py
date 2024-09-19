# with open("weather_data.csv") as file:
#     data = file.readlines()
import pandas

# with open("weather_data.csv") as file:
#     data = csv.reader(file)
#     temp = []
#     for row in data:
#         if row[1] != "temp":
#             temp.append(int(row[1]))
#
#     print(temp)

data = {
    "students": ["Amy", "James", "Angela"],
    "scores": [76, 56, 65]
}

data_frame = pandas.DataFrame(data)
data_frame.to_csv("new_data.csv")
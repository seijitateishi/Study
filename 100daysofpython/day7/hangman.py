import random

word_list = ["seiji", "pano", "kaio"]
word = random.choice(word_list)
guessed_letters = ''
answer = ''
while word != answer or len(guessed_letters) > 5:
    letter = input("give me a letter")

    if word.find('letter') != -1:
        answer = word[word.find('letter')]

    if guessed_letters.find(letter) != -1:
        print("u already guessed that letter")
    else:
        guessed_letters += letter

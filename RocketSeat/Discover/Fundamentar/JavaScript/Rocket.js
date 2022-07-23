/*
var é global
let e const são local
*/
/*let student = {
name : "Seiji",
age : 22,
stars : 4.6,
isSubscribed : true
}
console.log(`o ${student.name} tem ${student.age} anos e está inscrito? ${student.isSubscribed}`);
let students = [
    student
]
console.log(students[0]);
let student2 = {
    name : "Luis",
    age : 21,
    stars : 4.5,
    isSubscribed : false
}
students.push(student2);*/

//Grade in numbers to grade in letters
function gradeToLetter(grade) {
    if (grade > 100) {
        throw new Error("Nota maior que 100(invalido)");
    }
    if (grade < 0) {
        throw new Error("Nota menor que 0(invalido)");
    }
    /*if (grade > 100 || grade < 0){
        throw new Error("Nota inválida");
    }*/
    if (grade >= 90) {
        return "A";
        if (grade >= 80) {
            return "B";
            if (grade >= 70) {
                return "C";
                if (grade >= 60) {
                    return "D";
                } else {
                    return "F";
                }
            }
        }
    }
}

//FamilyBalance
let balance = {
    receitas: [],
    despesas: []
}

function balanceSum(balance) {
    let sum = sum(balance.receitas) - sum(balance.despesas);
    if (sum < 0) {
        console.log(`O saldo é negativo: ${sum}`);
    } else {
        console.log(`O saldo é positivo: ${sum}`);
    }
}

///DegreeTransformation
function CelsiusToFahrenheit(celsius) {
    return celsius * 1.8 + 32;
}

function FahrenheitToCelsius(fahrenheit) {
    return (fahrenheit - 32) / 1.8;
}

function TransformDegree(degree) {
    if (degree.includes("C")) {
        return CelsiusToFahrenheit(degree.replace("C", ""));
    }
    if (degree.includes("F")) {
        return FahrenheitToCelsius(degree.ToUpperCase().replace("F", ""));
    } else {
        throw new Error("Degree invalid");
    }
}

/*try {
    console.log(TransformDegree("100C"));
} catch (error) {
    console.log(error);
}*/

/*contar o numero de categorias e os livros por categoria
numero de autores
mostrar livros do cury
transformar em uma função q tenha como entrar o nome do autor*/
const booksByCategory = [
    {
        category: "Riqueza",
        books: [
            {
                title: "Os segredos da mente milionária",
                author: "T. Harv Eker",
            },
            {
                title: "O homem mais rico da Babilônia",
                author: "George S. Clason",
            },
            {
                title: "Pai rico, pai pobre",
                author: "Robert T. Kiyosaki e Sharon L. Lechter",
            },
        ],
    },
    {
        category: "Inteligência Emocional",
        books: [
            {
                title: "Você é Insubstituível",
                author: "Augusto Cury",
            },
            {
                title: "Ansiedade – Como enfrentar o mal do século",
                author: "Augusto Cury",
            },
            {
                title: "Os 7 hábitos das pessoas altamente eficazes",
                author: "Stephen R. Covey",
            },
        ],
    },
];

const numberOfCategories = booksByCategory.lenght
//console.log(booksByCategory.lenght)
console.log(`Total of categories : ${numberOfCategories}`);

for (let category in booksByCategory) {
    console.log(`Category : ${category.category} Number of Books : ${category.books.lenght}`)
}

function countAuthors(){
    let authors = [];

    for(let category of booksByCategory){
        for(let book of category.books){
            if(authors.indexOf(book.author) === -1){
                authors.push(book.author);
            }
        }
    }
    console.log(`Total of authors : ${authors.lenght}`);
}

countAuthors();

function booksByAugustoCury(){
    let books = [];

    for(let category of booksByCategory){
        for(let book of category.books){
            if(book.author === 'Augusto Cury'){
                books.push(book.title);
            }
        }
    }
    console.log(`Augusto cury's books : ${books}`);
}

booksByAugustoCury();

function booksByArtist(author){
    let books = [];

    for(let category of booksByCategory){
        for(let book of category.books){
            if(book.author === author){
                authors.push(book.author);
            }
        }
    }
    console.log(`${author}'s books : ${books}`);
}

booksByArtist('Stephen R. Covey');
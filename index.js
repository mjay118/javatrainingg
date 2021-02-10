let books = [];
function addBook() {
    let bookName = document.getElementById("bookName").value;
    let authorName = document.getElementById("authorName").value;
    let isbnNo = document.getElementById("isbn").value;

    let bookObj = {
        bookname: bookName,
        authorname: authorName,
        isbn: isbnNo,
        id: books.length + 1,
    };
    books.push(bookObj);
    showBooks();
    resetBookForm();
}


function showBooks() {
    document.getElementById("book-list").innerHTML = "";
    for (let i = 0; i < books.length; i++) {
        document.getElementById("book-list").innerHTML +=
            '<li class="book-item">' + "Id:  "+
            books[i].id +
            " , " +"Book Name:  "+
            books[i].bookname +
            " , " +"Author Name:  "+
            books[i].authorname +
            " , " +"ISBN:  "+
            books[i].isbn +
            "  " + "<br>"+"<br>"+
            '<button  class="b1" onclick="editBook(' + i + ')">' + "Edit" + "</button>" +
            '<button  class="b2" onclick="bookDelete(' + i + ')">' + "Delete" + "</button>" +
            "</li>";
    }
}


function resetBookForm() {
    document.getElementById("bookName").value = "";
    document.getElementById("authorName").value = "";
    document.getElementById("isbn").value = "";
}
function bookDelete(item) {
    books.splice(item, 1);
    showBooks();
}
function editBook(item) {
    console.log(item);
    console.log(books);
    console.log(books[item]);
    

    document.getElementById('edit').style.display = 'block';
    document.getElementById('forms').style.display = 'none';
    document.getElementById("EbookName").value = books[item]['bookname'];

    document.getElementById("EauthorName").value = books[item]['authorname'];
    document.getElementById("Eisbn").value = books[item]['isbn'];
    document.getElementById("Eid").value = books[item]['id'];

};
function updateBook(data) {
    let bookName = document.getElementById("EbookName").value;
    let authorName = document.getElementById("EauthorName").value;
    let isbnNo = document.getElementById("Eisbn").value;
    let id = document.getElementById("Eid").value;

    let books2 = books.map(function (book) {
        if (id == book.id) {
            return {
                bookname: bookName,
                authorname: authorName,
                isbn: isbnNo,
                id: id,
            };
        }
        else return book;
    })

    console.log(books2);
    books = books2;
    showBooks();
    document.getElementById('edit').style.display = 'none';
    document.getElementById('forms').style.display = 'block';
}
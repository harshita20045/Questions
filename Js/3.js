// Q3 (Bonus Challenge): Combine Both
// Write a program where:
// You first get student marks using callback.
// Then use those marks in a Promise to decide if the student has passed (marks >= 40).

function getMarks(studentId, callback) {
  if (studentId > 0) {

    const marks = Math.floor(Math.random() * 101);
    callback(marks, "Marks");
  } else {
    callback(null, "Invalid student ID");
  }
}

function checkMarks(marks, message) {
  return new Promise((resolve, reject) => {
    if (marks >= 40) {
      resolve(`${marks},${message}`);
    } else {
      reject(` ${message} (Marks: ${marks})`);
    }
  });
}


getMarks(1, (marks, message) => {
  if (marks === null) {
    console.log(message);
  } else {
    checkMarks(marks, message)
      .then(result => console.log(result))
      .catch(error => console.log(error));
  }
});
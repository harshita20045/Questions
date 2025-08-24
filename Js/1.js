function fetchStudentMarks(studentId, callback) {
 
  setTimeout(() => {

   let a = Math.random() * (100 - 4) + 4;
    if (studentId > 0) {
      callback(a);
    } else {
      callback("Invalid Student");
    }
  },2000);
}

fetchStudentMarks(1, (a) => {
  console.log(a);
});

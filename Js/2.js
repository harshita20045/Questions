
function fetchStudentData(studentId) {
  let student = [
    {
      id: 1,
      name: "a",
      marks: 34,
    },
    {
      id: 2,
      name: "b",
      marks: 24,
    },
    {
      id: 3,
      name: "c",
      marks: 54,
    },
  ];
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (studentId > 0) {
        var a = student.find((student, i) => {
          return student.id == studentId;
        });
        resolve(a);
      } else {
        reject("Invalid Student Id");
      }
    }, 2000);
  });
}

fetchStudentData(1)
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.log(error);
  });

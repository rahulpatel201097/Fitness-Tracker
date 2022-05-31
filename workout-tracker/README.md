 1) Use 'POST' method to save workout-

     http://localhost:8082/workout

  {
      "title": "Jogging",
      "note": "Take a break after 30 minutes",
      "caloriesBurntPerMin": 150.55,
      "category": "JOGGING"
  }

  2) Use 'GET' method to get all workout done-

     http://localhost:8082/workout

  3) Use 'PUT' method to find by id-

     http://localhost:8082/workout/id?id=(id_number)

  4) Use 'DELETE' method to delete workout by id-

     http://localhost:8082/workout/delete?id=(id_number)

  5) Use 'PUT' method to update the workout-

     http://localhost:8082/workout/update?id=(id_number)   

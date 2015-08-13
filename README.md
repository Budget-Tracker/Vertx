# Vertx
Budget-Tracker-Vertx - The repository for the server-side code for Budget Tracker, co-op project with @megamegax.

Database API

  budget {
  owners : [
   {
      id: 'asdf@gmail.com',
      rights: ["read","write"]
   },
   {
      id:'anotheruser@asdf.com',
      rights:["read"]
    }
  ],
data : [
   {  
      title: "gyerekek",
      comments : ["játék"],
      value : 2500,
      type : "cost",
      date: "05/12/15"
   },
   {
      title: "tartozás",
      type: "cost",
      value: 40000,
      date: "04/11/15",
      reminders : [
      { 
         before: 1,
         unit: "day"
      }
   ]
   },
    {
      title : "nyugdíj",
      value : 65000,
      type : "income",
      date: "20/02/15",
      recurrence : {
          every:  1,
          unit : "month"
      }
   }
]
}

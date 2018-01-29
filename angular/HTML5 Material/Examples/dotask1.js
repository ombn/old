var myVar;
function mainMsg(e)
{
  switch(e.data)
  {
    case "Start":
     self.postMessage("Hi! I am running!");
     myVar = "Start";
     break;
    case "Time":
      var dt = new Date();
      var currTime = dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds();
      self.postMessage("The time is " + currTime + "  " + myVar);
      break;
  }  

}

function errorHandler(e)
{
  console.log(e.message,e);
}

self.addEventListener("message",mainMsg,true);
self.addEventListener("error",errorHandler,true);

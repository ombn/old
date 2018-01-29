importScripts("Ext1.js");

function mainMsg(e)
{
  switch(e.data)
  {
    case "Start":
     self.postMessage("Hi! I am running!");
     break;
    case "Time":
      var currTime = returnTime();
      self.postMessage("The time is " + currTime);
      break;
  }  

}

function errorHandler(e)
{
  console.log(e.message,e);
}

self.addEventListener("message",mainMsg,true);
self.addEventListener("error",errorHandler,true);

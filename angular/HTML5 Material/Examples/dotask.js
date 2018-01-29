function mainMsg(e)
{
  self.postMessage("Worker says : " + e.data + " to you too!");

}

function errorHandler(e)
{
  console.log(e.message,e);
}

self.addEventListener("message",mainMsg,true);
self.addEventListener("error",errorHandler,true);

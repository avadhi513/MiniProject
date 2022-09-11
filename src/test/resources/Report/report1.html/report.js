$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/BHome.feature");
formatter.feature({
  "name": "Setting details in the NoBroker website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@asta"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.launch_the_browser()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Possible causes are invalid address of the remote server or browser start-up failure.\nBuild info: version: \u00274.3.0\u0027, revision: \u0027a4995e2c09*\u0027\nSystem info: host: \u0027DESKTOP-6MPPDND\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_331\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [null, newSession {capabilities\u003d[Capabilities {browserName: chrome, goog:chromeOptions: {args: [], extensions: []}}], desiredCapabilities\u003dCapabilities {browserName: chrome, goog:chromeOptions: {args: [], extensions: []}}}]\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:587)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:264)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:179)\r\n\tat org.openqa.selenium.chromium.ChromiumDriver.\u003cinit\u003e(ChromiumDriver.java:101)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:81)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:49)\r\n\tat com.base.Utility.getDriver(Utility.java:15)\r\n\tat com.stepdefinition.LoginSteps.launch_the_browser(LoginSteps.java:29)\r\n\tat ✽.Launch the browser(src/test/resources/Features/BHome.feature:5)\r\nCaused by: java.io.UncheckedIOException: java.net.ConnectException: Connection refused: no further information: localhost/0:0:0:0:0:0:0:1:53355\r\n\tat org.openqa.selenium.remote.http.netty.NettyHttpHandler.makeCall(NettyHttpHandler.java:73)\r\n\tat org.openqa.selenium.remote.http.AddSeleniumUserAgent.lambda$apply$0(AddSeleniumUserAgent.java:42)\r\n\tat org.openqa.selenium.remote.http.Filter.lambda$andFinally$1(Filter.java:56)\r\n\tat org.openqa.selenium.remote.http.netty.NettyHttpHandler.execute(NettyHttpHandler.java:49)\r\n\tat org.openqa.selenium.remote.http.AddSeleniumUserAgent.lambda$apply$0(AddSeleniumUserAgent.java:42)\r\n\tat org.openqa.selenium.remote.http.Filter.lambda$andFinally$1(Filter.java:56)\r\n\tat org.openqa.selenium.remote.http.netty.NettyClient.execute(NettyClient.java:98)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:120)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:102)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:67)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:156)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:569)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:264)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:179)\r\n\tat org.openqa.selenium.chromium.ChromiumDriver.\u003cinit\u003e(ChromiumDriver.java:101)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:81)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:49)\r\n\tat com.base.Utility.getDriver(Utility.java:15)\r\n\tat com.stepdefinition.LoginSteps.launch_the_browser(LoginSteps.java:29)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:49)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\nCaused by: java.net.ConnectException: Connection refused: no further information: localhost/0:0:0:0:0:0:0:1:53355\r\n\tat org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:179)\r\n\tat org.asynchttpclient.netty.channel.NettyChannelConnector$1.onFailure(NettyChannelConnector.java:108)\r\n\tat org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:28)\r\n\tat org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:20)\r\n\tat io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:578)\r\n\tat io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:571)\r\n\tat io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:550)\r\n\tat io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:491)\r\n\tat io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:616)\r\n\tat io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:609)\r\n\tat io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:117)\r\n\tat io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.fulfillConnectPromise(AbstractNioChannel.java:321)\r\n\tat io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:337)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:710)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)\r\n\tat io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)\r\n\tat io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)\r\n\tat io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)\r\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\r\n\tat java.lang.Thread.run(Unknown Source)\r\nCaused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: no further information: localhost/0:0:0:0:0:0:0:1:53355\r\nCaused by: java.net.ConnectException: Connection refused: no further information\r\n\tat sun.nio.ch.SocketChannelImpl.checkConnect(Native Method)\r\n\tat sun.nio.ch.SocketChannelImpl.finishConnect(Unknown Source)\r\n\tat io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:337)\r\n\tat io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:334)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:710)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)\r\n\tat io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)\r\n\tat io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)\r\n\tat io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)\r\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\r\n\tat java.lang.Thread.run(Unknown Source)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user Clicks on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_Clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enters Phone Number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enters_Phone_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clicks on I have Passowrd",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clicks_on_I_have_Passowrd()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enters the Password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enters_the_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.click_on_the_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Entering details for searching on Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@asta"
    }
  ]
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.user_is_on_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects a city",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.user_selects_a_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects a locality",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.user_selects_a_locality()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects the options(pg/ flat/ house)",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.user_selects_the_options_pg_flat_house()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects tenant type",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.user_selects_tenant_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects room type",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.user_selects_room_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Search button.",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.user_clicks_on_Search_button()"
});
formatter.result({
  "status": "skipped"
});
});
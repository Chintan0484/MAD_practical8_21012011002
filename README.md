# MAD_practical8_21012011002

AIM: What is BroadcastReceiver? Difference between Service and BroadcastReceiver. Create an Alarm application by using service & BroadcastReceiver by following below instructions.
A BroadcastReceiver and a Service are two fundamental components in the Android operating system used for various purposes, and they serve different roles.

BroadcastReceiver:
A BroadcastReceiver is an Android component that allows an application to respond to system-wide broadcast events or custom events within the app. It acts as a listener for these events and can perform actions in response to them. Broadcast events can be system-level events, such as low battery warnings, network connectivity changes, screen on/off, or even custom events that your app generates and sends to other parts of your app or other apps.
Key characteristics of BroadcastReceivers include:

BroadcastReceivers do not have a user interface. They are typically used to perform background tasks or trigger actions in response to specific events.
They are declared in the AndroidManifest.xml file or registered dynamically in code.
BroadcastReceivers can be used to initiate other Android components like Services or Activities in response to events.
Service:
Differences between BroadcastReceiver and Service:

Purpose:

BroadcastReceiver: Receives and responds to broadcast events, including system-wide and custom events.
Service: Performs background tasks, long-running operations, or tasks that don't require a user interface.
User Interface:

BroadcastReceiver: Does not have a user interface.
Service: Does not have a user interface by default, but it can interact with other UI components like Activities.
Lifespan:

BroadcastReceiver: Typically runs briefly to respond to events and then exits.
Service: Can run for an extended period, potentially even when the app is in the background.
Activation:

BroadcastReceiver: Activated by broadcast events.
Service: Started manually or in response to other components' requests.

1)Create MainActivity according to below UI design.

2)Create AlarmBroadcastReceiver class

3)Create AlarmService Class

4)Add android.permission.SCHEDULE_EXACT_ALARM Permission in Manifest file

![image](https://github.com/Chintan0484/MAD_practical8_21012011002/assets/98694412/f3e50248-1f1b-40cd-9b6e-c00ebdc60644)

![image](https://github.com/Chintan0484/MAD_practical8_21012011002/assets/98694412/36e80367-562e-478a-b70a-1fa634f351d5)

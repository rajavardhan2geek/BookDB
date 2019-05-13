import random
class Communication:
    def __init__(self, sender, receiver, message):
        self.sender = sender
        self.receiver = receiver
        self.message = message

class CommunicationList:
    def __init__(self):
        self.communicationlist =[]
    def process_messages(self,messages):
         for msg in messages:
             kingdomname,kmsg=msg.split(',')
             kingd =self.kingdoms.searchkingdom(kingdomname)
             kingdemblem = set(kingd.emblem.lower());
             msgset = set(kmsg.lower())
             result = all(elem in msgset for elem in kingdemblem)
             if(result):
                 self.kingdoms.alliedkingdom.append(kingd.name)
         return self.kingdoms.alliedkingdom
    def dopicksixmessages(self):
       ballotmessages = []
       while ballotmessages.__len__() != 6:
           commkingdomsmsg= random.choice(self.communicationlist)
           ballotmessages.append(commkingdomsmsg)
       return ballotmessages
    def doProcessBallotmessages(self,ballotmsgs):
        for  comm in ballotmsgs:
            if comm.sender != comm.receiver:
                receiverembset = set(comm.receiver.emblem.lower())
                msg = comm.message[1:comm.message.__len__()-2]
                msgset= set(msg.lower())
                # print("{}\n {}\n".format(receiverembset,msgset))
                result = all(elem in msgset for elem in receiverembset)
                if(result):
                    # print(' Message is corrected {} {}'.format(comm.receiver.emblem,comm.message))
                    print('{} {}  \n'.format(comm.sender.name,comm.receiver.name))

class kingdom:
    def __init__(self,kingdomname,emblemname):
        self.name =kingdomname
        self.emblem=emblemname


class kingdoms:
    def __init__(self,fivekingdoms):
        self.kingdomList = fivekingdoms
        self.alliedkingdom =[]
        self._competentrulers =[]

    def addkingdomtolist(self,kingdom):
        self.kingdomList.append(kingdom)

    def removekingdomfromlist(self,kingdom):
        self.kingdomList.remove(kingdom)
    def searchkingdom(self,kingdomname):
         for kingdom in self.kingdomList:
             if kingdomname.lower() == kingdom.name.lower():
                 return kingdom

    @property
    def competentrulers(self):
        "random Integer of List"
        return self._competentrulers

    @competentrulers.setter
    def competentrulers(self, value):
        self._competentrulers.append(value)


class MessageProcess:
    def __init__(self,kingdomlist):
        self.kingdoms=kingdomlist
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


    def ballot_msg(self):
        pass

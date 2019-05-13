import TameofThrones.Problem1 as problem
import  TameofThrones.Problem2 as problem2
import random
def solveproblem1(kingdomlistobj):
    ruler = input("Who is the ruler of Southeros? ")
    if( ruler != 'None'):
        print('Messages to kingdoms from ',ruler)
        msglist =[]
        msg=input();
        MP = problem.MessageProcess(kingdomlistobj);
        while(msg!='None'):
            list.append(msglist,msg)
            msg = input()
        kingdomlistobj.alliedkingdom= MP.process_messages(msglist);
        if(kingdomlistobj.alliedkingdom):
          print('Allies of ruler ?\n',ruler,kingdomlistobj.alliedkingdom)
    else:
       print("Allies of ruler ? \n" ,ruler,"None")

def solveproblem2(kingdomlistobj):
    file = open('.//Problem2//boc-messages','r')
    messages = file.readlines()
    competentrulermsg=input('Enter the kingdoms competing to be the ruler: ')
    competentrulers = competentrulermsg.split(' ')
    for kingdomname in competentrulers:
        kingdomlistobj.competentrulers.append(kingdomlistobj.searchkingdom(kingdomname))
    print(repr(kingdomlistobj.competentrulers))
    commlist = problem2.CommunicationList()
    for msg in messages:
            skingdom = random.choice(kingdomlistobj.competentrulers)
            rkingdom = random.choice(kingdomlistobj.kingdomList)
            commobj = problem2.Communication(skingdom,rkingdom,msg)
            commlist.communicationlist.append(commobj)

    print(str(commlist.communicationlist.__len__()))
    file.close()
    ballotmsgs=commlist.dopicksixmessages()
    commlist.doProcessBallotmessages(ballotmsgs)
    print(ballotmsgs.__len__())

def mainprogram():
    airk = problem.kingdom('AIR', 'Owl')
    landk = problem.kingdom('LAND', 'Panda')
    waterk = problem.kingdom('WATER', 'Octopus')
    icek = problem.kingdom('ICE', 'Mammoth')
    fire = problem.kingdom('FIRE', 'Dragon')
    newkingdomlist = [airk, landk, waterk, icek,fire]
    kingdomlistobj = problem.kingdoms(newkingdomlist);
    solveproblem1(kingdomlistobj)
    print(' problem 2')
    solveproblem2(kingdomlistobj)
mainprogram()

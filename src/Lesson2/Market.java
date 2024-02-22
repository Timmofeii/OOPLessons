package Lesson2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market implements QueueBehavior, MarketBehaviour {
    private List<Actor> queue = new ArrayList<>();

    public List<Actor> getWalkPeoplesList() {
        return walkPeoplesList;
    }

    public void setWalkPeoplesList(List<Actor> walkPeoplesList) {
        this.walkPeoplesList = walkPeoplesList;
    }

    private List<Actor> walkPeoplesList = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " Зашел в магазин");
        getWalkPeoplesList().add(actor);
    }

    @Override
    public void update() {
        if (!queue.isEmpty()) {
            takeOrders();
            giveOrders();
        }else {
            System.out.println("Очередь пуста");
        }


    }

    @Override
    public void takenQueue(Actor actor) {
        System.out.println(actor.getName() + " wait in queue");

    }

    @Override
    public void takeOrders() {

        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " ordered");
            }
        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " taken his order");

            }
        } releaseForQueue();

    }

    public void releaseFromMarket(List<Actor> actors) {

     queue.removeAll(actors);
    }

    @Override
    public void releaseForQueue() {
        List<Actor> releasedAct = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                releasedAct.add(actor);
                System.out.println(actor.getName() + " go to exit");

            }

        }
        releaseFromMarket(releasedAct);
    }

    public void printList() {
        System.out.println("По магазину гуляют сейчас");
        for (Actor actor : walkPeoplesList) {
            System.out.println(actor.getName());
        }
    }

    public void goingQueue(String name) {
        Actor actor = foundActor(name);
        if (actor != null) {
            queue.add(actor);
            walkPeoplesList.remove(actor);
        }
    }


    public Actor foundActor(String name) {
        for (Actor actor : walkPeoplesList) {
            if (actor.getName().equals(name)) {
                return actor;
            }
        }
        System.out.println("Таких нет");
        return null;
    }

    public void goOut(String name) {
        Actor actor = foundActor(name);
        if (actor != null) {
            walkPeoplesList.remove(actor);
            printList();
        }
    }
}


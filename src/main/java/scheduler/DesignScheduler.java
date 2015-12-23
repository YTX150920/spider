package scheduler;

import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.scheduler.Scheduler;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DesignScheduler implements Scheduler {

    Set<String> set = new HashSet();
    Queue<Request> queue = new LinkedList();

    @Override
    public void push(Request request, Task task) {

        if (set.add(request.getUrl())) {
            queue.add(request);
        }
        System.out.println(request.toString());
    }

    @Override
    public Request poll(Task task) {
        return queue.poll();
    }
}

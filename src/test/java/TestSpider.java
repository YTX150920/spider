import org.junit.Test;
import pipeline.ConsolePipeline;
import processor.TestProcessor;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;

public class TestSpider {

    @Test
    public void test1() {

        Spider spider = new Spider(new TestProcessor());
        //Request request = new Request("http://zangmizhe.com/");

        spider
                .addUrl("http://zangmizhe.com/")
                //.addRequest(request)
                .addPipeline(new ConsolePipeline())

                .thread(1)

                .run();
    }
}

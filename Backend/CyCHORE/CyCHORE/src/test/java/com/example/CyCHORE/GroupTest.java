package com.example.CyCHORE;

import com.example.CyCHORE.Chatroom.*;
import com.example.CyCHORE.Group.GroupController;
import com.example.CyCHORE.Task.Task;
import com.example.CyCHORE.Task.TaskRepository;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.CyCHORE.Chatroom.MessageController.addMessage;
import static com.example.CyCHORE.Chatroom.MessageController.getChatroomMessages;
import static com.example.CyCHORE.Chatroom.UserChatroomController.getChatroomUsers;
import static com.example.CyCHORE.Chatroom.UserChatroomController.setLastUpdatedTimestamp;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupTest {

    @Mock
    TaskRepository tr;

    @MockBean
    GroupController gc;
    @Mock
    HttpServletRequest request;

    @Mock
    UserChatroomRepository ucr;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getGroupTaskPoolGroupControllerTest() throws IOException, JSONException {


//        MockHttpServletRequest request = new MockHttpServletRequest();
//        request.addParameter("1");
//        List<Task> i = gc.getGroupTaskPool(request);
//        try {
//            when(gc.getGroupTaskPool(request)).thenReturn(i);
//            assertEquals("0", gc.getGroupTaskPool(request));
//            MockHttpServletRequest request2 = new MockHttpServletRequest();
//            assertEquals(null, gc.getGroupTaskPool(request2));
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

//        Task mock[] = new Task[3];
//        for (int i = 0; i < 3; i++){
//            mock[i] = new Task(i, "String description", i, false, "deadline", "time_completed", false, i, i, "title");
//        }
//        when(tr.findAll()).thenReturn(Arrays.asList(mock));
//        List<Task> i = gc.getFinishedTasksInGroup(1);
//        ArrayList<Task> expected = new ArrayList<>();
//        assertEquals(expected, i);
    }

    @Test
    public void getFinishedTasksInGroupGroupControllerTest() throws IOException, JSONException {

//        MockHttpServletRequest request = new MockHttpServletRequest();
//        request.addParameter("5");
//        List<Task> i = gc.getGroupTaskPool(request);
//        try {
//            when(gc.getGroupTaskPool(request)).thenReturn(i);
//            assertEquals("0", gc.getGroupTaskPool(request));
//            MockHttpServletRequest request2 = new MockHttpServletRequest();
//            assertEquals(null, gc.getGroupTaskPool(request2));
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

//        Task mock[] = new Task[3];
//        for (int i = 0; i < 3; i++){
//            mock[i] = new Task(i, "String description", i, false, "deadline", "time_completed", false, i, i, "title");
//        }
//        when(tr.findAll()).thenReturn(Arrays.asList(mock));
//        List<Task> i = gc.getFinishedTasksInGroup(1);
//        ArrayList<Task> expected = new ArrayList<>();
//        assertEquals(expected, i);
    }

}
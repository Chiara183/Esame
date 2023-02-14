package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.matcher.control.TextMatchers;
import org.testfx.util.WaitForAsyncUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Calculator");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
//    protected final FxRobot ROBOT = new FxRobot();
//    public static void launch(Class<? extends Application> appClass){
//        try {
//            FxToolkit.registerPrimaryStage();
//            FxToolkit.setupApplication(appClass);
//        } catch (TimeoutException e) {
//
//        }
//
//   }
////    @BeforeEach
////    public void setUp() {
////        launch(CalcApp.class);
////        WaitForAsyncUtils.waitForFxEvents(100);
////    }

//    @Test
//    void titleTest(){
//        launch(CalcApp.class);
//        Stage stage = FxToolkit.toolkitContext().getRegisteredStage();
//        String title = stage.getTitle();
//        assertEquals("Calculator", title);
//    }
////
////    @AfterEach
////    public void tearDown() {
////        try {
////            FxToolkit.cleanupStages();
////        } catch (TimeoutException e) {
////
////        }
////    }

    @Test
    public void testSum() {
        clickOn("#1Button");
        clickOn("#plusButton");
        clickOn("#2Button");
        clickOn("#equalButton");
        //String result = String.valueOf(lookup(".output").queryText());
        // then:
        FxAssert.verifyThat("#output", TextMatchers.hasText("3.0"));
    }
}

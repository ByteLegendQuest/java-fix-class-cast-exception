package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ChallengeTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        Fish fish = new Fish("Fish");
        Dog dog1 = new Dog("Dog" + new Random().nextInt());
        Dog dog2 = new Dog("Dog" + new Random().nextInt());
        String regex = dog1.getName() + " is walking\\s+" + dog2.getName() + " is walking\\s+";
        capture.expect(
                Matchers.matchesPattern(
                        regex));

        Challenge.allDogsWalk(dog1, fish, dog2);
    }
}

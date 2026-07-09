package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Testing extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "World!");
    }

    @Override
    public void loop() {

    }

    @Override
    public void init_loop() {
        super.init_loop();
    }
}

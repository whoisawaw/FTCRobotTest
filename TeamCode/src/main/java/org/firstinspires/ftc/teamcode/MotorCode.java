package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class MotorCode extends OpMode
{

    DcMotor motor;
    Servo servo;
    @Override
    public void init()
    {
        motor = hardwareMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        servo = hardwareMap.get(Servo.class, "servo");
        telemetry.addData("Hello", "World");
    }

    @Override
    public void loop()
    {
        motor.setPower(1);
        servo.setPosition(1);
        telemetry.addData("gpx", gamepad1.left_stick_x);
        telemetry.addData("gpy", gamepad1.left_stick_y);
        telemetry.addData("x", gamepad1.a);
    }
}

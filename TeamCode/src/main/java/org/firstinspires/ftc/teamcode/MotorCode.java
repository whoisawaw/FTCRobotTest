package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
public class MotorCode extends OpMode
{

    DcMotorEx motor;
    CRServo servo;
    @Override
    public void init()
    {
        motor = hardwareMap.get(DcMotorEx.class, "pp");
        motor.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        servo = hardwareMap.get(CRServo.class, "servopp");
        telemetry.addData("Hello", "World");
    }

    @Override
    public void loop()
    {
        float game1xr = gamepad1.right_stick_x;
        float game1xl = gamepad1.left_stick_x;
        motor.setVelocity(game1xl * 360 * 0.01);
        servo.setPower(game1xr);
        telemetry.addData("gpx", gamepad1.left_stick_x);
        telemetry.addData("gpy", gamepad1.left_stick_y);
        telemetry.addData("x", gamepad1.a);
    }
}

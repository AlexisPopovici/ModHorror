package net.jonson.modhorror.entity.client;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import net.minecraft.world.entity.Entity;

public class DreadhoofModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart dreadhoof;
	private final ModelPart mana_stanga;
	private final ModelPart mana_dreapta;
	private final ModelPart corp;
	private final ModelPart totfarapicioare;
	private final ModelPart cap;
	private final ModelPart bone4;
	private final ModelPart bone9;
	private final ModelPart bone8;
	private final ModelPart picior_stang;
	private final ModelPart labasstanga;
	private final ModelPart picistang;
	private final ModelPart picior_drept;
	private final ModelPart labadreapta;
	private final ModelPart picior_drept2;

	public DreadhoofModel(ModelPart root) {
		this.dreadhoof = root.getChild("Dreadhoof");
		this.mana_stanga = this.dreadhoof.getChild("mana_stanga");
		this.mana_dreapta = this.dreadhoof.getChild("mana_dreapta");
		this.corp = this.dreadhoof.getChild("corp");
		this.totfarapicioare = this.dreadhoof.getChild("totfarapicioare");
		this.cap = this.totfarapicioare.getChild("cap");
		this.bone4 = this.cap.getChild("bone4");
		this.bone9 = this.bone4.getChild("bone9");
		this.bone8 = this.bone4.getChild("bone8");
		this.picior_stang = this.dreadhoof.getChild("picior_stang");
		this.labasstanga = this.picior_stang.getChild("labasstanga");
		this.picistang = this.picior_stang.getChild("picistang");
		this.picior_drept = this.dreadhoof.getChild("picior_drept");
		this.labadreapta = this.picior_drept.getChild("labadreapta");
		this.picior_drept2 = this.picior_drept.getChild("picior_drept2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Dreadhoof = partdefinition.addOrReplaceChild("Dreadhoof", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition mana_stanga = Dreadhoof.addOrReplaceChild("mana_stanga", CubeListBuilder.create(), PartPose.offset(-7.0F, -18.0F, 0.0F));

		PartDefinition mana_stanga_r1 = mana_stanga.addOrReplaceChild("mana_stanga_r1", CubeListBuilder.create().texOffs(32, 22).addBox(0.5F, -2.5F, -12.0F, 3.5F, 3.5F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition mana_dreapta = Dreadhoof.addOrReplaceChild("mana_dreapta", CubeListBuilder.create(), PartPose.offset(8.0F, -18.0F, 0.0F));

		PartDefinition mana_dreapta_r1 = mana_dreapta.addOrReplaceChild("mana_dreapta_r1", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -2.5F, -12.0F, 3.5F, 3.5F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition corp = Dreadhoof.addOrReplaceChild("corp", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -18.6741F, -2.8385F, 12.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition totfarapicioare = Dreadhoof.addOrReplaceChild("totfarapicioare", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cap = totfarapicioare.addOrReplaceChild("cap", CubeListBuilder.create().texOffs(24, 26).addBox(-1.5F, 0.3259F, -6.8385F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(46, 55).addBox(-3.0F, -1.6741F, -3.8385F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, -4.0F));

		PartDefinition bone4 = cap.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 41).addBox(-4.0F, -22.6741F, -6.8385F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 4.0F));

		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition cube_r1 = bone9.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 47).addBox(-1.0F, -1.655F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, -28.045F, -6.1667F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cornstang_r1 = bone9.addOrReplaceChild("cornstang_r1", CubeListBuilder.create().texOffs(30, 47).addBox(-1.0F, -1.6259F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -26.6741F, -5.8385F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone8 = bone4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition cube_r2 = bone8.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 18).addBox(-1.2F, -1.6262F, -0.9075F, 2.0F, 1.8F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(2.2F, -29.6738F, -6.0925F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone8.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 47).addBox(-1.0F, -2.355F, -1.0F, 2.0F, 2.7F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0F, -28.045F, -6.1667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition corn_drept_r1 = bone8.addOrReplaceChild("corn_drept_r1", CubeListBuilder.create().texOffs(40, 18).addBox(-1.0F, -1.6259F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -26.6741F, -5.8385F, 0.2182F, 0.0F, 0.0F));

		PartDefinition picior_stang = Dreadhoof.addOrReplaceChild("picior_stang", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition labasstanga = picior_stang.addOrReplaceChild("labasstanga", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition picior_stang_r1 = labasstanga.addOrReplaceChild("picior_stang_r1", CubeListBuilder.create().texOffs(40, 0).addBox(-3.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition picistang = picior_stang.addOrReplaceChild("picistang", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = picistang.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 9).addBox(-3.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.999F, -3.908F, -0.1755F, -0.0873F, 0.0F, 0.0F));

		PartDefinition picior_drept = Dreadhoof.addOrReplaceChild("picior_drept", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition labadreapta = picior_drept.addOrReplaceChild("labadreapta", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition picior_drept_r1 = labadreapta.addOrReplaceChild("picior_drept_r1", CubeListBuilder.create().texOffs(30, 38).addBox(-1.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition picior_drept2 = picior_drept.addOrReplaceChild("picior_drept2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = picior_drept2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 38).addBox(-1.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.001F, -3.8645F, -0.1784F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		dreadhoof.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return dreadhoof;
	}
}
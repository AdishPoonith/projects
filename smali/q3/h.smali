.class public Lq3/h;
.super Lj2/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq3/h$c;,
        Lq3/h$b;,
        Lq3/h$a;
    }
.end annotation


# static fields
.field private static final w1:[I

.field private static x1:Z

.field private static y1:Z


# instance fields
.field private final M0:Landroid/content/Context;

.field private final N0:Lq3/l;

.field private final O0:Lq3/x$a;

.field private final P0:J

.field private final Q0:I

.field private final R0:Z

.field private S0:Lq3/h$b;

.field private T0:Z

.field private U0:Z

.field private V0:Landroid/view/Surface;

.field private W0:Lq3/i;

.field private X0:Z

.field private Y0:I

.field private Z0:Z

.field private a1:Z

.field private b1:Z

.field private c1:J

.field private d1:J

.field private e1:J

.field private f1:I

.field private g1:I

.field private h1:I

.field private i1:J

.field private j1:J

.field private k1:J

.field private l1:I

.field private m1:J

.field private n1:I

.field private o1:I

.field private p1:I

.field private q1:F

.field private r1:Lq3/z;

.field private s1:Z

.field private t1:I

.field u1:Lq3/h$c;

.field private v1:Lq3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lq3/h;->w1:[I

    return-void

    :array_0
    .array-data 4
        0x780
        0x640
        0x5a0
        0x500
        0x3c0
        0x356
        0x280
        0x21c
        0x1e0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lj2/l$b;Lj2/q;JZLandroid/os/Handler;Lq3/x;I)V
    .locals 11

    const/high16 v10, 0x41f00000    # 30.0f

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lq3/h;-><init>(Landroid/content/Context;Lj2/l$b;Lj2/q;JZLandroid/os/Handler;Lq3/x;IF)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj2/l$b;Lj2/q;JZLandroid/os/Handler;Lq3/x;IF)V
    .locals 7

    move-object v6, p0

    const/4 v1, 0x2

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p6

    move/from16 v5, p10

    invoke-direct/range {v0 .. v5}, Lj2/o;-><init>(ILj2/l$b;Lj2/q;ZF)V

    move-wide v0, p4

    iput-wide v0, v6, Lq3/h;->P0:J

    move/from16 v0, p9

    iput v0, v6, Lq3/h;->Q0:I

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, v6, Lq3/h;->M0:Landroid/content/Context;

    new-instance v1, Lq3/l;

    invoke-direct {v1, v0}, Lq3/l;-><init>(Landroid/content/Context;)V

    iput-object v1, v6, Lq3/h;->N0:Lq3/l;

    new-instance v0, Lq3/x$a;

    move-object v1, p7

    move-object v2, p8

    invoke-direct {v0, p7, p8}, Lq3/x$a;-><init>(Landroid/os/Handler;Lq3/x;)V

    iput-object v0, v6, Lq3/h;->O0:Lq3/x$a;

    invoke-static {}, Lq3/h;->y1()Z

    move-result v0

    iput-boolean v0, v6, Lq3/h;->R0:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, v6, Lq3/h;->d1:J

    const/4 v0, -0x1

    iput v0, v6, Lq3/h;->n1:I

    iput v0, v6, Lq3/h;->o1:I

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, v6, Lq3/h;->q1:F

    const/4 v0, 0x1

    iput v0, v6, Lq3/h;->Y0:I

    const/4 v0, 0x0

    iput v0, v6, Lq3/h;->t1:I

    invoke-direct {p0}, Lq3/h;->v1()V

    return-void
.end method

.method private static A1()Z
    .locals 16

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x1c

    const/4 v2, 0x7

    const/4 v3, 0x6

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-gt v0, v1, :cond_8

    sget-object v11, Lp3/n0;->b:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    :goto_0
    const/4 v11, -0x1

    goto/16 :goto_1

    :sswitch_0
    const-string v12, "machuca"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    goto :goto_0

    :cond_0
    const/4 v11, 0x7

    goto :goto_1

    :sswitch_1
    const-string v12, "once"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_0

    :cond_1
    const/4 v11, 0x6

    goto :goto_1

    :sswitch_2
    const-string v12, "magnolia"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_0

    :cond_2
    const/4 v11, 0x5

    goto :goto_1

    :sswitch_3
    const-string v12, "aquaman"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    goto :goto_0

    :cond_3
    const/4 v11, 0x4

    goto :goto_1

    :sswitch_4
    const-string v12, "oneday"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    goto :goto_0

    :cond_4
    const/4 v11, 0x3

    goto :goto_1

    :sswitch_5
    const-string v12, "dangalUHD"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_0

    :cond_5
    const/4 v11, 0x2

    goto :goto_1

    :sswitch_6
    const-string v12, "dangalFHD"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    goto :goto_0

    :cond_6
    const/4 v11, 0x1

    goto :goto_1

    :sswitch_7
    const-string v12, "dangal"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    goto :goto_0

    :cond_7
    const/4 v11, 0x0

    :goto_1
    packed-switch v11, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    return v10

    :cond_8
    :goto_2
    const/16 v11, 0x1b

    if-gt v0, v11, :cond_9

    sget-object v12, Lp3/n0;->b:Ljava/lang/String;

    const-string v13, "HWEML"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    return v10

    :cond_9
    sget-object v12, Lp3/n0;->d:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v13

    const/16 v14, 0x8

    sparse-switch v13, :sswitch_data_1

    :goto_3
    const/4 v13, -0x1

    goto/16 :goto_4

    :sswitch_8
    const-string v13, "AFTEUFF014"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    goto :goto_3

    :cond_a
    const/16 v13, 0x8

    goto/16 :goto_4

    :sswitch_9
    const-string v13, "AFTSO001"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_b

    goto :goto_3

    :cond_b
    const/4 v13, 0x7

    goto :goto_4

    :sswitch_a
    const-string v13, "AFTEU014"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    goto :goto_3

    :cond_c
    const/4 v13, 0x6

    goto :goto_4

    :sswitch_b
    const-string v13, "AFTEU011"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_d

    goto :goto_3

    :cond_d
    const/4 v13, 0x5

    goto :goto_4

    :sswitch_c
    const-string v13, "AFTR"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_e

    goto :goto_3

    :cond_e
    const/4 v13, 0x4

    goto :goto_4

    :sswitch_d
    const-string v13, "AFTN"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_f

    goto :goto_3

    :cond_f
    const/4 v13, 0x3

    goto :goto_4

    :sswitch_e
    const-string v13, "AFTA"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_10

    goto :goto_3

    :cond_10
    const/4 v13, 0x2

    goto :goto_4

    :sswitch_f
    const-string v13, "AFTKMST12"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_11

    goto :goto_3

    :cond_11
    const/4 v13, 0x1

    goto :goto_4

    :sswitch_10
    const-string v13, "AFTJMST12"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_12

    goto :goto_3

    :cond_12
    const/4 v13, 0x0

    :goto_4
    packed-switch v13, :pswitch_data_1

    const/16 v13, 0x1a

    if-gt v0, v13, :cond_a0

    sget-object v0, Lp3/n0;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_2

    :goto_5
    const/4 v1, -0x1

    goto/16 :goto_6

    :sswitch_11
    const-string v1, "HWWAS-H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_5

    :cond_13
    const/16 v1, 0x8b

    goto/16 :goto_6

    :sswitch_12
    const-string v1, "HWVNS-H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_5

    :cond_14
    const/16 v1, 0x8a

    goto/16 :goto_6

    :sswitch_13
    const-string v1, "ELUGA_Prim"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_5

    :cond_15
    const/16 v1, 0x89

    goto/16 :goto_6

    :sswitch_14
    const-string v1, "ELUGA_Note"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_5

    :cond_16
    const/16 v1, 0x88

    goto/16 :goto_6

    :sswitch_15
    const-string v1, "ASUS_X00AD_2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_5

    :cond_17
    const/16 v1, 0x87

    goto/16 :goto_6

    :sswitch_16
    const-string v1, "HWCAM-H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_5

    :cond_18
    const/16 v1, 0x86

    goto/16 :goto_6

    :sswitch_17
    const-string v1, "HWBLN-H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_5

    :cond_19
    const/16 v1, 0x85

    goto/16 :goto_6

    :sswitch_18
    const-string v1, "DM-01K"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_5

    :cond_1a
    const/16 v1, 0x84

    goto/16 :goto_6

    :sswitch_19
    const-string v1, "BRAVIA_ATV3_4K"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_5

    :cond_1b
    const/16 v1, 0x83

    goto/16 :goto_6

    :sswitch_1a
    const-string v1, "Infinix-X572"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_5

    :cond_1c
    const/16 v1, 0x82

    goto/16 :goto_6

    :sswitch_1b
    const-string v1, "PB2-670M"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_5

    :cond_1d
    const/16 v1, 0x81

    goto/16 :goto_6

    :sswitch_1c
    const-string v1, "santoni"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_5

    :cond_1e
    const/16 v1, 0x80

    goto/16 :goto_6

    :sswitch_1d
    const-string v1, "iball8735_9806"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_5

    :cond_1f
    const/16 v1, 0x7f

    goto/16 :goto_6

    :sswitch_1e
    const-string v1, "CPH1715"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_5

    :cond_20
    const/16 v1, 0x7e

    goto/16 :goto_6

    :sswitch_1f
    const-string v1, "CPH1609"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_5

    :cond_21
    const/16 v1, 0x7d

    goto/16 :goto_6

    :sswitch_20
    const-string v1, "woods_f"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_5

    :cond_22
    const/16 v1, 0x7c

    goto/16 :goto_6

    :sswitch_21
    const-string v1, "htc_e56ml_dtul"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto/16 :goto_5

    :cond_23
    const/16 v1, 0x7b

    goto/16 :goto_6

    :sswitch_22
    const-string v1, "EverStar_S"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_5

    :cond_24
    const/16 v1, 0x7a

    goto/16 :goto_6

    :sswitch_23
    const-string v1, "hwALE-H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto/16 :goto_5

    :cond_25
    const/16 v1, 0x79

    goto/16 :goto_6

    :sswitch_24
    const-string v1, "itel_S41"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto/16 :goto_5

    :cond_26
    const/16 v1, 0x78

    goto/16 :goto_6

    :sswitch_25
    const-string v1, "LS-5017"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto/16 :goto_5

    :cond_27
    const/16 v1, 0x77

    goto/16 :goto_6

    :sswitch_26
    const-string v1, "panell_d"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto/16 :goto_5

    :cond_28
    const/16 v1, 0x76

    goto/16 :goto_6

    :sswitch_27
    const-string v1, "j2xlteins"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto/16 :goto_5

    :cond_29
    const/16 v1, 0x75

    goto/16 :goto_6

    :sswitch_28
    const-string v1, "A7000plus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto/16 :goto_5

    :cond_2a
    const/16 v1, 0x74

    goto/16 :goto_6

    :sswitch_29
    const-string v1, "manning"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    goto/16 :goto_5

    :cond_2b
    const/16 v1, 0x73

    goto/16 :goto_6

    :sswitch_2a
    const-string v1, "GIONEE_WBL7519"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_5

    :cond_2c
    const/16 v1, 0x72

    goto/16 :goto_6

    :sswitch_2b
    const-string v1, "GIONEE_WBL7365"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto/16 :goto_5

    :cond_2d
    const/16 v1, 0x71

    goto/16 :goto_6

    :sswitch_2c
    const-string v1, "GIONEE_WBL5708"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    goto/16 :goto_5

    :cond_2e
    const/16 v1, 0x70

    goto/16 :goto_6

    :sswitch_2d
    const-string v1, "QM16XE_U"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    goto/16 :goto_5

    :cond_2f
    const/16 v1, 0x6f

    goto/16 :goto_6

    :sswitch_2e
    const-string v1, "Pixi5-10_4G"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    goto/16 :goto_5

    :cond_30
    const/16 v1, 0x6e

    goto/16 :goto_6

    :sswitch_2f
    const-string v1, "TB3-850M"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_31

    goto/16 :goto_5

    :cond_31
    const/16 v1, 0x6d

    goto/16 :goto_6

    :sswitch_30
    const-string v1, "TB3-850F"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    goto/16 :goto_5

    :cond_32
    const/16 v1, 0x6c

    goto/16 :goto_6

    :sswitch_31
    const-string v1, "TB3-730X"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    goto/16 :goto_5

    :cond_33
    const/16 v1, 0x6b

    goto/16 :goto_6

    :sswitch_32
    const-string v1, "TB3-730F"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_34

    goto/16 :goto_5

    :cond_34
    const/16 v1, 0x6a

    goto/16 :goto_6

    :sswitch_33
    const-string v1, "A7020a48"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    goto/16 :goto_5

    :cond_35
    const/16 v1, 0x69

    goto/16 :goto_6

    :sswitch_34
    const-string v1, "A7010a48"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36

    goto/16 :goto_5

    :cond_36
    const/16 v1, 0x68

    goto/16 :goto_6

    :sswitch_35
    const-string v1, "griffin"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    goto/16 :goto_5

    :cond_37
    const/16 v1, 0x67

    goto/16 :goto_6

    :sswitch_36
    const-string v1, "marino_f"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38

    goto/16 :goto_5

    :cond_38
    const/16 v1, 0x66

    goto/16 :goto_6

    :sswitch_37
    const-string v1, "CPY83_I00"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_39

    goto/16 :goto_5

    :cond_39
    const/16 v1, 0x65

    goto/16 :goto_6

    :sswitch_38
    const-string v1, "A2016a40"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3a

    goto/16 :goto_5

    :cond_3a
    const/16 v1, 0x64

    goto/16 :goto_6

    :sswitch_39
    const-string v1, "le_x6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b

    goto/16 :goto_5

    :cond_3b
    const/16 v1, 0x63

    goto/16 :goto_6

    :sswitch_3a
    const-string v1, "l5460"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    goto/16 :goto_5

    :cond_3c
    const/16 v1, 0x62

    goto/16 :goto_6

    :sswitch_3b
    const-string v1, "i9031"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto/16 :goto_5

    :cond_3d
    const/16 v1, 0x61

    goto/16 :goto_6

    :sswitch_3c
    const-string v1, "X3_HK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3e

    goto/16 :goto_5

    :cond_3e
    const/16 v1, 0x60

    goto/16 :goto_6

    :sswitch_3d
    const-string v1, "V23GB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3f

    goto/16 :goto_5

    :cond_3f
    const/16 v1, 0x5f

    goto/16 :goto_6

    :sswitch_3e
    const-string v1, "Q4310"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_40

    goto/16 :goto_5

    :cond_40
    const/16 v1, 0x5e

    goto/16 :goto_6

    :sswitch_3f
    const-string v1, "Q4260"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_41

    goto/16 :goto_5

    :cond_41
    const/16 v1, 0x5d

    goto/16 :goto_6

    :sswitch_40
    const-string v1, "PRO7S"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_42

    goto/16 :goto_5

    :cond_42
    const/16 v1, 0x5c

    goto/16 :goto_6

    :sswitch_41
    const-string v1, "F3311"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_43

    goto/16 :goto_5

    :cond_43
    const/16 v1, 0x5b

    goto/16 :goto_6

    :sswitch_42
    const-string v1, "F3215"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_44

    goto/16 :goto_5

    :cond_44
    const/16 v1, 0x5a

    goto/16 :goto_6

    :sswitch_43
    const-string v1, "F3213"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_45

    goto/16 :goto_5

    :cond_45
    const/16 v1, 0x59

    goto/16 :goto_6

    :sswitch_44
    const-string v1, "F3211"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_46

    goto/16 :goto_5

    :cond_46
    const/16 v1, 0x58

    goto/16 :goto_6

    :sswitch_45
    const-string v1, "F3116"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_47

    goto/16 :goto_5

    :cond_47
    const/16 v1, 0x57

    goto/16 :goto_6

    :sswitch_46
    const-string v1, "F3113"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_48

    goto/16 :goto_5

    :cond_48
    const/16 v1, 0x56

    goto/16 :goto_6

    :sswitch_47
    const-string v1, "F3111"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_49

    goto/16 :goto_5

    :cond_49
    const/16 v1, 0x55

    goto/16 :goto_6

    :sswitch_48
    const-string v1, "E5643"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4a

    goto/16 :goto_5

    :cond_4a
    const/16 v1, 0x54

    goto/16 :goto_6

    :sswitch_49
    const-string v1, "A1601"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4b

    goto/16 :goto_5

    :cond_4b
    const/16 v1, 0x53

    goto/16 :goto_6

    :sswitch_4a
    const-string v1, "Aura_Note_2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4c

    goto/16 :goto_5

    :cond_4c
    const/16 v1, 0x52

    goto/16 :goto_6

    :sswitch_4b
    const-string v1, "602LV"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4d

    goto/16 :goto_5

    :cond_4d
    const/16 v1, 0x51

    goto/16 :goto_6

    :sswitch_4c
    const-string v1, "601LV"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4e

    goto/16 :goto_5

    :cond_4e
    const/16 v1, 0x50

    goto/16 :goto_6

    :sswitch_4d
    const-string v1, "MEIZU_M5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4f

    goto/16 :goto_5

    :cond_4f
    const/16 v1, 0x4f

    goto/16 :goto_6

    :sswitch_4e
    const-string v1, "p212"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_50

    goto/16 :goto_5

    :cond_50
    const/16 v1, 0x4e

    goto/16 :goto_6

    :sswitch_4f
    const-string v1, "mido"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_51

    goto/16 :goto_5

    :cond_51
    const/16 v1, 0x4d

    goto/16 :goto_6

    :sswitch_50
    const-string v1, "kate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_52

    goto/16 :goto_5

    :cond_52
    const/16 v1, 0x4c

    goto/16 :goto_6

    :sswitch_51
    const-string v1, "fugu"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_53

    goto/16 :goto_5

    :cond_53
    const/16 v1, 0x4b

    goto/16 :goto_6

    :sswitch_52
    const-string v1, "XE2X"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_54

    goto/16 :goto_5

    :cond_54
    const/16 v1, 0x4a

    goto/16 :goto_6

    :sswitch_53
    const-string v1, "Q427"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_55

    goto/16 :goto_5

    :cond_55
    const/16 v1, 0x49

    goto/16 :goto_6

    :sswitch_54
    const-string v1, "Q350"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_56

    goto/16 :goto_5

    :cond_56
    const/16 v1, 0x48

    goto/16 :goto_6

    :sswitch_55
    const-string v1, "P681"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_57

    goto/16 :goto_5

    :cond_57
    const/16 v1, 0x47

    goto/16 :goto_6

    :sswitch_56
    const-string v1, "F04J"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_58

    goto/16 :goto_5

    :cond_58
    const/16 v1, 0x46

    goto/16 :goto_6

    :sswitch_57
    const-string v1, "F04H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_59

    goto/16 :goto_5

    :cond_59
    const/16 v1, 0x45

    goto/16 :goto_6

    :sswitch_58
    const-string v1, "F03H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5a

    goto/16 :goto_5

    :cond_5a
    const/16 v1, 0x44

    goto/16 :goto_6

    :sswitch_59
    const-string v1, "F02H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5b

    goto/16 :goto_5

    :cond_5b
    const/16 v1, 0x43

    goto/16 :goto_6

    :sswitch_5a
    const-string v1, "F01J"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5c

    goto/16 :goto_5

    :cond_5c
    const/16 v1, 0x42

    goto/16 :goto_6

    :sswitch_5b
    const-string v1, "F01H"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5d

    goto/16 :goto_5

    :cond_5d
    const/16 v1, 0x41

    goto/16 :goto_6

    :sswitch_5c
    const-string v1, "1714"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5e

    goto/16 :goto_5

    :cond_5e
    const/16 v1, 0x40

    goto/16 :goto_6

    :sswitch_5d
    const-string v1, "1713"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5f

    goto/16 :goto_5

    :cond_5f
    const/16 v1, 0x3f

    goto/16 :goto_6

    :sswitch_5e
    const-string v1, "1601"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_60

    goto/16 :goto_5

    :cond_60
    const/16 v1, 0x3e

    goto/16 :goto_6

    :sswitch_5f
    const-string v1, "flo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_61

    goto/16 :goto_5

    :cond_61
    const/16 v1, 0x3d

    goto/16 :goto_6

    :sswitch_60
    const-string v1, "deb"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_62

    goto/16 :goto_5

    :cond_62
    const/16 v1, 0x3c

    goto/16 :goto_6

    :sswitch_61
    const-string v1, "cv3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_63

    goto/16 :goto_5

    :cond_63
    const/16 v1, 0x3b

    goto/16 :goto_6

    :sswitch_62
    const-string v1, "cv1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_64

    goto/16 :goto_5

    :cond_64
    const/16 v1, 0x3a

    goto/16 :goto_6

    :sswitch_63
    const-string v1, "Z80"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_65

    goto/16 :goto_5

    :cond_65
    const/16 v1, 0x39

    goto/16 :goto_6

    :sswitch_64
    const-string v1, "QX1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_66

    goto/16 :goto_5

    :cond_66
    const/16 v1, 0x38

    goto/16 :goto_6

    :sswitch_65
    const-string v1, "PLE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_67

    goto/16 :goto_5

    :cond_67
    const/16 v1, 0x37

    goto/16 :goto_6

    :sswitch_66
    const-string v1, "P85"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_68

    goto/16 :goto_5

    :cond_68
    const/16 v1, 0x36

    goto/16 :goto_6

    :sswitch_67
    const-string v1, "MX6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_69

    goto/16 :goto_5

    :cond_69
    const/16 v1, 0x35

    goto/16 :goto_6

    :sswitch_68
    const-string v1, "M5c"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6a

    goto/16 :goto_5

    :cond_6a
    const/16 v1, 0x34

    goto/16 :goto_6

    :sswitch_69
    const-string v1, "M04"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6b

    goto/16 :goto_5

    :cond_6b
    const/16 v1, 0x33

    goto/16 :goto_6

    :sswitch_6a
    const-string v1, "JGZ"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6c

    goto/16 :goto_5

    :cond_6c
    const/16 v1, 0x32

    goto/16 :goto_6

    :sswitch_6b
    const-string v1, "mh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6d

    goto/16 :goto_5

    :cond_6d
    const/16 v1, 0x31

    goto/16 :goto_6

    :sswitch_6c
    const-string v1, "b5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6e

    goto/16 :goto_5

    :cond_6e
    const/16 v1, 0x30

    goto/16 :goto_6

    :sswitch_6d
    const-string v1, "V5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6f

    goto/16 :goto_5

    :cond_6f
    const/16 v1, 0x2f

    goto/16 :goto_6

    :sswitch_6e
    const-string v1, "V1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_70

    goto/16 :goto_5

    :cond_70
    const/16 v1, 0x2e

    goto/16 :goto_6

    :sswitch_6f
    const-string v1, "Q5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_71

    goto/16 :goto_5

    :cond_71
    const/16 v1, 0x2d

    goto/16 :goto_6

    :sswitch_70
    const-string v1, "C1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_72

    goto/16 :goto_5

    :cond_72
    const/16 v1, 0x2c

    goto/16 :goto_6

    :sswitch_71
    const-string v1, "woods_fn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_73

    goto/16 :goto_5

    :cond_73
    const/16 v1, 0x2b

    goto/16 :goto_6

    :sswitch_72
    const-string v1, "ELUGA_A3_Pro"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_74

    goto/16 :goto_5

    :cond_74
    const/16 v1, 0x2a

    goto/16 :goto_6

    :sswitch_73
    const-string v1, "Z12_PRO"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_75

    goto/16 :goto_5

    :cond_75
    const/16 v1, 0x29

    goto/16 :goto_6

    :sswitch_74
    const-string v1, "BLACK-1X"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_76

    goto/16 :goto_5

    :cond_76
    const/16 v1, 0x28

    goto/16 :goto_6

    :sswitch_75
    const-string v1, "taido_row"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_77

    goto/16 :goto_5

    :cond_77
    const/16 v1, 0x27

    goto/16 :goto_6

    :sswitch_76
    const-string v1, "Pixi4-7_3G"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_78

    goto/16 :goto_5

    :cond_78
    const/16 v1, 0x26

    goto/16 :goto_6

    :sswitch_77
    const-string v1, "GIONEE_GBL7360"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_79

    goto/16 :goto_5

    :cond_79
    const/16 v1, 0x25

    goto/16 :goto_6

    :sswitch_78
    const-string v1, "GiONEE_CBL7513"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7a

    goto/16 :goto_5

    :cond_7a
    const/16 v1, 0x24

    goto/16 :goto_6

    :sswitch_79
    const-string v1, "OnePlus5T"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7b

    goto/16 :goto_5

    :cond_7b
    const/16 v1, 0x23

    goto/16 :goto_6

    :sswitch_7a
    const-string v1, "whyred"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7c

    goto/16 :goto_5

    :cond_7c
    const/16 v1, 0x22

    goto/16 :goto_6

    :sswitch_7b
    const-string v1, "watson"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7d

    goto/16 :goto_5

    :cond_7d
    const/16 v1, 0x21

    goto/16 :goto_6

    :sswitch_7c
    const-string v1, "SVP-DTV15"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7e

    goto/16 :goto_5

    :cond_7e
    const/16 v1, 0x20

    goto/16 :goto_6

    :sswitch_7d
    const-string v1, "A7000-a"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7f

    goto/16 :goto_5

    :cond_7f
    const/16 v1, 0x1f

    goto/16 :goto_6

    :sswitch_7e
    const-string v1, "nicklaus_f"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_80

    goto/16 :goto_5

    :cond_80
    const/16 v1, 0x1e

    goto/16 :goto_6

    :sswitch_7f
    const-string v1, "tcl_eu"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_81

    goto/16 :goto_5

    :cond_81
    const/16 v1, 0x1d

    goto/16 :goto_6

    :sswitch_80
    const-string v2, "ELUGA_Ray_X"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9e

    goto/16 :goto_5

    :sswitch_81
    const-string v1, "s905x018"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_82

    goto/16 :goto_5

    :cond_82
    const/16 v1, 0x1b

    goto/16 :goto_6

    :sswitch_82
    const-string v1, "A10-70L"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_83

    goto/16 :goto_5

    :cond_83
    const/16 v1, 0x1a

    goto/16 :goto_6

    :sswitch_83
    const-string v1, "A10-70F"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_84

    goto/16 :goto_5

    :cond_84
    const/16 v1, 0x19

    goto/16 :goto_6

    :sswitch_84
    const-string v1, "namath"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_85

    goto/16 :goto_5

    :cond_85
    const/16 v1, 0x18

    goto/16 :goto_6

    :sswitch_85
    const-string v1, "Slate_Pro"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_86

    goto/16 :goto_5

    :cond_86
    const/16 v1, 0x17

    goto/16 :goto_6

    :sswitch_86
    const-string v1, "iris60"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_87

    goto/16 :goto_5

    :cond_87
    const/16 v1, 0x16

    goto/16 :goto_6

    :sswitch_87
    const-string v1, "BRAVIA_ATV2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_88

    goto/16 :goto_5

    :cond_88
    const/16 v1, 0x15

    goto/16 :goto_6

    :sswitch_88
    const-string v1, "GiONEE_GBL7319"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_89

    goto/16 :goto_5

    :cond_89
    const/16 v1, 0x14

    goto/16 :goto_6

    :sswitch_89
    const-string v1, "panell_dt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8a

    goto/16 :goto_5

    :cond_8a
    const/16 v1, 0x13

    goto/16 :goto_6

    :sswitch_8a
    const-string v1, "panell_ds"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8b

    goto/16 :goto_5

    :cond_8b
    const/16 v1, 0x12

    goto/16 :goto_6

    :sswitch_8b
    const-string v1, "panell_dl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8c

    goto/16 :goto_5

    :cond_8c
    const/16 v1, 0x11

    goto/16 :goto_6

    :sswitch_8c
    const-string v1, "vernee_M5"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8d

    goto/16 :goto_5

    :cond_8d
    const/16 v1, 0x10

    goto/16 :goto_6

    :sswitch_8d
    const-string v1, "pacificrim"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8e

    goto/16 :goto_5

    :cond_8e
    const/16 v1, 0xf

    goto/16 :goto_6

    :sswitch_8e
    const-string v1, "Phantom6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8f

    goto/16 :goto_5

    :cond_8f
    const/16 v1, 0xe

    goto/16 :goto_6

    :sswitch_8f
    const-string v1, "ComioS1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_90

    goto/16 :goto_5

    :cond_90
    const/16 v1, 0xd

    goto/16 :goto_6

    :sswitch_90
    const-string v1, "XT1663"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_91

    goto/16 :goto_5

    :cond_91
    const/16 v1, 0xc

    goto/16 :goto_6

    :sswitch_91
    const-string v1, "RAIJIN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_92

    goto/16 :goto_5

    :cond_92
    const/16 v1, 0xb

    goto/16 :goto_6

    :sswitch_92
    const-string v1, "AquaPowerM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_93

    goto/16 :goto_5

    :cond_93
    const/16 v1, 0xa

    goto/16 :goto_6

    :sswitch_93
    const-string v1, "PGN611"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_94

    goto/16 :goto_5

    :cond_94
    const/16 v1, 0x9

    goto/16 :goto_6

    :sswitch_94
    const-string v1, "PGN610"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_95

    goto/16 :goto_5

    :cond_95
    const/16 v1, 0x8

    goto/16 :goto_6

    :sswitch_95
    const-string v1, "PGN528"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_96

    goto/16 :goto_5

    :cond_96
    const/4 v1, 0x7

    goto :goto_6

    :sswitch_96
    const-string v1, "NX573J"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_97

    goto/16 :goto_5

    :cond_97
    const/4 v1, 0x6

    goto :goto_6

    :sswitch_97
    const-string v1, "NX541J"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_98

    goto/16 :goto_5

    :cond_98
    const/4 v1, 0x5

    goto :goto_6

    :sswitch_98
    const-string v1, "CP8676_I02"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_99

    goto/16 :goto_5

    :cond_99
    const/4 v1, 0x4

    goto :goto_6

    :sswitch_99
    const-string v1, "K50a40"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9a

    goto/16 :goto_5

    :cond_9a
    const/4 v1, 0x3

    goto :goto_6

    :sswitch_9a
    const-string v1, "GIONEE_SWW1631"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9b

    goto/16 :goto_5

    :cond_9b
    const/4 v1, 0x2

    goto :goto_6

    :sswitch_9b
    const-string v1, "GIONEE_SWW1627"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9c

    goto/16 :goto_5

    :cond_9c
    const/4 v1, 0x1

    goto :goto_6

    :sswitch_9c
    const-string v1, "GIONEE_SWW1609"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9d

    goto/16 :goto_5

    :cond_9d
    const/4 v1, 0x0

    :cond_9e
    :goto_6
    packed-switch v1, :pswitch_data_2

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    const-string v0, "JSN-L21"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9f

    goto :goto_7

    :cond_9f
    :pswitch_1
    return v10

    :cond_a0
    :goto_7
    return v9

    :pswitch_2
    return v10

    :sswitch_data_0
    .sparse-switch
        -0x4fd0ea5f -> :sswitch_7
        -0x48b8f57f -> :sswitch_6
        -0x48b8bd30 -> :sswitch_5
        -0x3c588c8a -> :sswitch_4
        -0x2d5172e2 -> :sswitch_3
        -0x3de1850 -> :sswitch_2
        0x341e81 -> :sswitch_1
        0x31316ffa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x14d76e6c -> :sswitch_10
        -0x132295cd -> :sswitch_f
        0x1e9d52 -> :sswitch_e
        0x1e9d5f -> :sswitch_d
        0x1e9d63 -> :sswitch_c
        0x6a6b6031 -> :sswitch_b
        0x6a6b6034 -> :sswitch_a
        0x6b2deee6 -> :sswitch_9
        0x7e53ab34 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x7fd6c3bd -> :sswitch_9c
        -0x7fd6c381 -> :sswitch_9b
        -0x7fd6c368 -> :sswitch_9a
        -0x7d026749 -> :sswitch_99
        -0x78929d6a -> :sswitch_98
        -0x75f50a1e -> :sswitch_97
        -0x75f4fe9d -> :sswitch_96
        -0x736f875c -> :sswitch_95
        -0x736f83c2 -> :sswitch_94
        -0x736f83c1 -> :sswitch_93
        -0x7327ce1c -> :sswitch_92
        -0x705c574b -> :sswitch_91
        -0x651ebb62 -> :sswitch_90
        -0x6423293b -> :sswitch_8f
        -0x604f5117 -> :sswitch_8e
        -0x5f691e13 -> :sswitch_8d
        -0x5ca40cc4 -> :sswitch_8c
        -0x58520ec1 -> :sswitch_8b
        -0x58520eba -> :sswitch_8a
        -0x58520eb9 -> :sswitch_89
        -0x4eaed329 -> :sswitch_88
        -0x4892fb4f -> :sswitch_87
        -0x465b3df3 -> :sswitch_86
        -0x43e6c939 -> :sswitch_85
        -0x3ec0fcc5 -> :sswitch_84
        -0x3b33cca0 -> :sswitch_83
        -0x3b33cc9a -> :sswitch_82
        -0x398ae3f6 -> :sswitch_81
        -0x391f0fb4 -> :sswitch_80
        -0x346837ae -> :sswitch_7f
        -0x323788e3 -> :sswitch_7e
        -0x30f57652 -> :sswitch_7d
        -0x2f88a116 -> :sswitch_7c
        -0x2f61ed98 -> :sswitch_7b
        -0x2efd0837 -> :sswitch_7a
        -0x2e9e9441 -> :sswitch_79
        -0x2247b8b1 -> :sswitch_78
        -0x1f0fa2b7 -> :sswitch_77
        -0x19af3b41 -> :sswitch_76
        -0x114fad3e -> :sswitch_75
        -0x10dae90b -> :sswitch_74
        -0x1084b7b7 -> :sswitch_73
        -0xa5988e9 -> :sswitch_72
        -0x35f9fbf -> :sswitch_71
        0x84e -> :sswitch_70
        0xa04 -> :sswitch_6f
        0xa9b -> :sswitch_6e
        0xa9f -> :sswitch_6d
        0xc13 -> :sswitch_6c
        0xd9b -> :sswitch_6b
        0x11ebd -> :sswitch_6a
        0x12711 -> :sswitch_69
        0x127db -> :sswitch_68
        0x12beb -> :sswitch_67
        0x1334d -> :sswitch_66
        0x135c9 -> :sswitch_65
        0x13aea -> :sswitch_64
        0x158d2 -> :sswitch_63
        0x1821e -> :sswitch_62
        0x18220 -> :sswitch_61
        0x18401 -> :sswitch_60
        0x18c69 -> :sswitch_5f
        0x1716e6 -> :sswitch_5e
        0x171ac8 -> :sswitch_5d
        0x171ac9 -> :sswitch_5c
        0x208c61 -> :sswitch_5b
        0x208c63 -> :sswitch_5a
        0x208c80 -> :sswitch_59
        0x208c9f -> :sswitch_58
        0x208cbe -> :sswitch_57
        0x208cc0 -> :sswitch_56
        0x252f5f -> :sswitch_55
        0x25981d -> :sswitch_54
        0x259b88 -> :sswitch_53
        0x290a13 -> :sswitch_52
        0x3021fd -> :sswitch_51
        0x321e47 -> :sswitch_50
        0x332327 -> :sswitch_4f
        0x33ab63 -> :sswitch_4e
        0x27691fb -> :sswitch_4d
        0x30f8881 -> :sswitch_4c
        0x30f8c42 -> :sswitch_4b
        0x349f581 -> :sswitch_4a
        0x3ab0ea7 -> :sswitch_49
        0x3e53ea5 -> :sswitch_48
        0x3f25a44 -> :sswitch_47
        0x3f25a46 -> :sswitch_46
        0x3f25a49 -> :sswitch_45
        0x3f25e05 -> :sswitch_44
        0x3f25e07 -> :sswitch_43
        0x3f25e09 -> :sswitch_42
        0x3f261c6 -> :sswitch_41
        0x48dce49 -> :sswitch_40
        0x48dd589 -> :sswitch_3f
        0x48dd8af -> :sswitch_3e
        0x4d36832 -> :sswitch_3d
        0x4f0b0e7 -> :sswitch_3c
        0x5e2479e -> :sswitch_3b
        0x60acc05 -> :sswitch_3a
        0x6214744 -> :sswitch_39
        0x9d91379 -> :sswitch_38
        0xadc0551 -> :sswitch_37
        0xea056b3 -> :sswitch_36
        0x1121dbc3 -> :sswitch_35
        0x1255818c -> :sswitch_34
        0x1263990d -> :sswitch_33
        0x12d90f3a -> :sswitch_32
        0x12d90f4c -> :sswitch_31
        0x12d98b1b -> :sswitch_30
        0x12d98b22 -> :sswitch_2f
        0x1844c711 -> :sswitch_2e
        0x1e3e8044 -> :sswitch_2d
        0x2f5336ed -> :sswitch_2c
        0x2f54115e -> :sswitch_2b
        0x2f541849 -> :sswitch_2a
        0x31cf010e -> :sswitch_29
        0x36ad82f4 -> :sswitch_28
        0x391a0b61 -> :sswitch_27
        0x3f3728cd -> :sswitch_26
        0x448ec687 -> :sswitch_25
        0x46260f63 -> :sswitch_24
        0x4c505106 -> :sswitch_23
        0x4de67084 -> :sswitch_22
        0x506ac5a9 -> :sswitch_21
        0x5abad9cd -> :sswitch_20
        0x64d2e6e9 -> :sswitch_1f
        0x64d2eac5 -> :sswitch_1e
        0x65e4085b -> :sswitch_1d
        0x6f373556 -> :sswitch_1c
        0x719f1dcb -> :sswitch_1b
        0x75d9a0f0 -> :sswitch_1a
        0x7796d144 -> :sswitch_19
        0x785bcb26 -> :sswitch_18
        0x78fc0e50 -> :sswitch_17
        0x790521fb -> :sswitch_16
        0x7933207f -> :sswitch_15
        0x7a05a409 -> :sswitch_14
        0x7a0696bd -> :sswitch_13
        0x7a16dfe7 -> :sswitch_12
        0x7a1f0e95 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static B1(Lj2/n;Ls1/n1;)I
    .locals 9

    iget v0, p1, Ls1/n1;->z:I

    iget v1, p1, Ls1/n1;->A:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_d

    if-ne v1, v2, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v3, p1, Ls1/n1;->u:Ljava/lang/String;

    const-string v4, "video/dolby-vision"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "video/avc"

    const-string v6, "video/hevc"

    const/4 v7, 0x1

    const/4 v8, 0x2

    if-eqz v4, :cond_3

    invoke-static {p1}, Lj2/v;->q(Ls1/n1;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v3, 0x200

    if-eq p1, v3, :cond_1

    if-eq p1, v7, :cond_1

    if-ne p1, v8, :cond_2

    :cond_1
    move-object v3, v5

    goto :goto_0

    :cond_2
    move-object v3, v6

    :cond_3
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result p1

    const/4 v4, 0x4

    sparse-switch p1, :sswitch_data_0

    :goto_1
    const/4 v7, -0x1

    goto :goto_2

    :sswitch_0
    const-string p1, "video/x-vnd.on2.vp9"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v7, 0x6

    goto :goto_2

    :sswitch_1
    const-string p1, "video/x-vnd.on2.vp8"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v7, 0x5

    goto :goto_2

    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v7, 0x4

    goto :goto_2

    :sswitch_3
    const-string p1, "video/mp4v-es"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    const/4 v7, 0x3

    goto :goto_2

    :sswitch_4
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    const/4 v7, 0x2

    goto :goto_2

    :sswitch_5
    const-string p1, "video/av01"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :sswitch_6
    const-string p1, "video/3gpp"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    const/4 v7, 0x0

    :cond_a
    :goto_2
    packed-switch v7, :pswitch_data_0

    return v2

    :pswitch_0
    mul-int v0, v0, v1

    invoke-static {v0, v4}, Lq3/h;->G1(II)I

    move-result p0

    return p0

    :pswitch_1
    sget-object p1, Lp3/n0;->d:Ljava/lang/String;

    const-string v3, "BRAVIA 4K 2015"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    sget-object v3, Lp3/n0;->c:Ljava/lang/String;

    const-string v4, "Amazon"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v3, "KFSOWI"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "AFTS"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-boolean p0, p0, Lj2/n;->g:Z

    if-eqz p0, :cond_b

    goto :goto_3

    :cond_b
    const/16 p0, 0x10

    invoke-static {v0, p0}, Lp3/n0;->l(II)I

    move-result p1

    invoke-static {v1, p0}, Lp3/n0;->l(II)I

    move-result v0

    mul-int p1, p1, v0

    mul-int/lit8 p1, p1, 0x10

    mul-int/lit8 p1, p1, 0x10

    invoke-static {p1, v8}, Lq3/h;->G1(II)I

    move-result p0

    return p0

    :cond_c
    :goto_3
    return v2

    :pswitch_2
    const/high16 p0, 0x200000

    mul-int v0, v0, v1

    invoke-static {v0, v8}, Lq3/h;->G1(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    :pswitch_3
    mul-int v0, v0, v1

    invoke-static {v0, v8}, Lq3/h;->G1(II)I

    move-result p0

    return p0

    :cond_d
    :goto_4
    return v2

    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_6
        -0x631b55f6 -> :sswitch_5
        -0x63185e82 -> :sswitch_4
        0x46cdc642 -> :sswitch_3
        0x4f62373a -> :sswitch_2
        0x5f50bed8 -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method private static C1(Lj2/n;Ls1/n1;)Landroid/graphics/Point;
    .locals 13

    iget v0, p1, Ls1/n1;->A:I

    iget v1, p1, Ls1/n1;->z:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    if-eqz v3, :cond_2

    move v0, v1

    :cond_2
    int-to-float v1, v0

    int-to-float v5, v4

    div-float/2addr v1, v5

    sget-object v5, Lq3/h;->w1:[I

    array-length v6, v5

    :goto_2
    const/4 v7, 0x0

    if-ge v2, v6, :cond_a

    aget v8, v5, v2

    int-to-float v9, v8

    mul-float v9, v9, v1

    float-to-int v9, v9

    if-le v8, v4, :cond_a

    if-gt v9, v0, :cond_3

    goto :goto_7

    :cond_3
    sget v10, Lp3/n0;->a:I

    const/16 v11, 0x15

    if-lt v10, v11, :cond_6

    if-eqz v3, :cond_4

    move v7, v9

    goto :goto_3

    :cond_4
    move v7, v8

    :goto_3
    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    move v8, v9

    :goto_4
    invoke-virtual {p0, v7, v8}, Lj2/n;->c(II)Landroid/graphics/Point;

    move-result-object v7

    iget v8, p1, Ls1/n1;->B:F

    iget v9, v7, Landroid/graphics/Point;->x:I

    iget v10, v7, Landroid/graphics/Point;->y:I

    float-to-double v11, v8

    invoke-virtual {p0, v9, v10, v11, v12}, Lj2/n;->w(IID)Z

    move-result v8

    if-eqz v8, :cond_9

    return-object v7

    :cond_6
    const/16 v10, 0x10

    :try_start_0
    invoke-static {v8, v10}, Lp3/n0;->l(II)I

    move-result v8

    mul-int/lit8 v8, v8, 0x10

    invoke-static {v9, v10}, Lp3/n0;->l(II)I

    move-result v9

    mul-int/lit8 v9, v9, 0x10

    mul-int v10, v8, v9

    invoke-static {}, Lj2/v;->N()I

    move-result v11

    if-gt v10, v11, :cond_9

    new-instance p0, Landroid/graphics/Point;

    if-eqz v3, :cond_7

    move p1, v9

    goto :goto_5

    :cond_7
    move p1, v8

    :goto_5
    if-eqz v3, :cond_8

    goto :goto_6

    :cond_8
    move v8, v9

    :goto_6
    invoke-direct {p0, p1, v8}, Landroid/graphics/Point;-><init>(II)V
    :try_end_0
    .catch Lj2/v$c; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :catch_0
    :cond_a
    :goto_7
    return-object v7
.end method

.method private static E1(Landroid/content/Context;Lj2/q;Ls1/n1;ZZ)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj2/q;",
            "Ls1/n1;",
            "ZZ)",
            "Ljava/util/List<",
            "Lj2/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p2, Ls1/n1;->u:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p1, v0, p3, p4}, Lj2/q;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v0

    invoke-static {p2}, Lj2/v;->m(Ls1/n1;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p1, v1, p3, p4}, Lj2/q;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    sget p3, Lp3/n0;->a:I

    const/16 p4, 0x1a

    if-lt p3, p4, :cond_2

    iget-object p2, p2, Ls1/n1;->u:Ljava/lang/String;

    const-string p3, "video/dolby-vision"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p0}, Lq3/h$a;->a(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {p1}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/google/common/collect/q$a;->g(Ljava/lang/Iterable;)Lcom/google/common/collect/q$a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/google/common/collect/q$a;->g(Ljava/lang/Iterable;)Lcom/google/common/collect/q$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0
.end method

.method protected static F1(Lj2/n;Ls1/n1;)I
    .locals 3

    iget v0, p1, Ls1/n1;->v:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object p0, p1, Ls1/n1;->w:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p0, :cond_0

    iget-object v2, p1, Ls1/n1;->w:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    array-length v2, v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget p0, p1, Ls1/n1;->v:I

    add-int/2addr p0, v1

    return p0

    :cond_1
    invoke-static {p0, p1}, Lq3/h;->B1(Lj2/n;Ls1/n1;)I

    move-result p0

    return p0
.end method

.method private static G1(II)I
    .locals 0

    mul-int/lit8 p0, p0, 0x3

    mul-int/lit8 p1, p1, 0x2

    div-int/2addr p0, p1

    return p0
.end method

.method private static I1(J)Z
    .locals 3

    const-wide/16 v0, -0x7530

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static J1(J)Z
    .locals 3

    const-wide/32 v0, -0x7a120

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private L1()V
    .locals 6

    iget v0, p0, Lq3/h;->f1:I

    if-lez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lq3/h;->e1:J

    sub-long v2, v0, v2

    iget-object v4, p0, Lq3/h;->O0:Lq3/x$a;

    iget v5, p0, Lq3/h;->f1:I

    invoke-virtual {v4, v5, v2, v3}, Lq3/x$a;->n(IJ)V

    const/4 v2, 0x0

    iput v2, p0, Lq3/h;->f1:I

    iput-wide v0, p0, Lq3/h;->e1:J

    :cond_0
    return-void
.end method

.method private N1()V
    .locals 4

    iget v0, p0, Lq3/h;->l1:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lq3/h;->O0:Lq3/x$a;

    iget-wide v2, p0, Lq3/h;->k1:J

    invoke-virtual {v1, v2, v3, v0}, Lq3/x$a;->B(JI)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lq3/h;->k1:J

    const/4 v0, 0x0

    iput v0, p0, Lq3/h;->l1:I

    :cond_0
    return-void
.end method

.method private O1()V
    .locals 5

    iget v0, p0, Lq3/h;->n1:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Lq3/h;->o1:I

    if-eq v2, v1, :cond_2

    :cond_0
    iget-object v1, p0, Lq3/h;->r1:Lq3/z;

    if-eqz v1, :cond_1

    iget v2, v1, Lq3/z;->j:I

    if-ne v2, v0, :cond_1

    iget v0, v1, Lq3/z;->k:I

    iget v2, p0, Lq3/h;->o1:I

    if-ne v0, v2, :cond_1

    iget v0, v1, Lq3/z;->l:I

    iget v2, p0, Lq3/h;->p1:I

    if-ne v0, v2, :cond_1

    iget v0, v1, Lq3/z;->m:F

    iget v1, p0, Lq3/h;->q1:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    :cond_1
    new-instance v0, Lq3/z;

    iget v1, p0, Lq3/h;->n1:I

    iget v2, p0, Lq3/h;->o1:I

    iget v3, p0, Lq3/h;->p1:I

    iget v4, p0, Lq3/h;->q1:F

    invoke-direct {v0, v1, v2, v3, v4}, Lq3/z;-><init>(IIIF)V

    iput-object v0, p0, Lq3/h;->r1:Lq3/z;

    iget-object v1, p0, Lq3/h;->O0:Lq3/x$a;

    invoke-virtual {v1, v0}, Lq3/x$a;->D(Lq3/z;)V

    :cond_2
    return-void
.end method

.method private P1()V
    .locals 2

    iget-boolean v0, p0, Lq3/h;->X0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq3/h;->O0:Lq3/x$a;

    iget-object v1, p0, Lq3/h;->V0:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lq3/x$a;->A(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private Q1()V
    .locals 2

    iget-object v0, p0, Lq3/h;->r1:Lq3/z;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lq3/h;->O0:Lq3/x$a;

    invoke-virtual {v1, v0}, Lq3/x$a;->D(Lq3/z;)V

    :cond_0
    return-void
.end method

.method private R1(JJLs1/n1;)V
    .locals 7

    iget-object v0, p0, Lq3/h;->v1:Lq3/j;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj2/o;->t0()Landroid/media/MediaFormat;

    move-result-object v6

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v6}, Lq3/j;->g(JJLs1/n1;Landroid/media/MediaFormat;)V

    :cond_0
    return-void
.end method

.method private T1()V
    .locals 0

    invoke-virtual {p0}, Lj2/o;->f1()V

    return-void
.end method

.method private U1()V
    .locals 3

    iget-object v0, p0, Lq3/h;->V0:Landroid/view/Surface;

    iget-object v1, p0, Lq3/h;->W0:Lq3/i;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iput-object v2, p0, Lq3/h;->V0:Landroid/view/Surface;

    :cond_0
    invoke-virtual {v1}, Lq3/i;->release()V

    iput-object v2, p0, Lq3/h;->W0:Lq3/i;

    return-void
.end method

.method private static X1(Lj2/l;[B)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "hdr10-plus-info"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    invoke-interface {p0, v0}, Lj2/l;->l(Landroid/os/Bundle;)V

    return-void
.end method

.method private Y1()V
    .locals 5

    iget-wide v0, p0, Lq3/h;->P0:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lq3/h;->P0:J

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    iput-wide v0, p0, Lq3/h;->d1:J

    return-void
.end method

.method private Z1(Ljava/lang/Object;)V
    .locals 4

    instance-of v0, p1, Landroid/view/Surface;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/Surface;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    iget-object v0, p0, Lq3/h;->W0:Lq3/i;

    if-eqz v0, :cond_1

    move-object p1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lj2/o;->q0()Lj2/n;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lq3/h;->e2(Lj2/n;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Lq3/h;->M0:Landroid/content/Context;

    iget-boolean v0, v0, Lj2/n;->g:Z

    invoke-static {p1, v0}, Lq3/i;->c(Landroid/content/Context;Z)Lq3/i;

    move-result-object p1

    iput-object p1, p0, Lq3/h;->W0:Lq3/i;

    :cond_2
    :goto_1
    iget-object v0, p0, Lq3/h;->V0:Landroid/view/Surface;

    if-eq v0, p1, :cond_6

    iput-object p1, p0, Lq3/h;->V0:Landroid/view/Surface;

    iget-object v0, p0, Lq3/h;->N0:Lq3/l;

    invoke-virtual {v0, p1}, Lq3/l;->m(Landroid/view/Surface;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq3/h;->X0:Z

    invoke-virtual {p0}, Ls1/f;->getState()I

    move-result v0

    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object v1

    if-eqz v1, :cond_4

    sget v2, Lp3/n0;->a:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_3

    if-eqz p1, :cond_3

    iget-boolean v2, p0, Lq3/h;->T0:Z

    if-nez v2, :cond_3

    invoke-virtual {p0, v1, p1}, Lq3/h;->a2(Lj2/l;Landroid/view/Surface;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lj2/o;->X0()V

    invoke-virtual {p0}, Lj2/o;->H0()V

    :cond_4
    :goto_2
    if-eqz p1, :cond_5

    iget-object v1, p0, Lq3/h;->W0:Lq3/i;

    if-eq p1, v1, :cond_5

    invoke-direct {p0}, Lq3/h;->Q1()V

    invoke-direct {p0}, Lq3/h;->u1()V

    const/4 p1, 0x2

    if-ne v0, p1, :cond_7

    invoke-direct {p0}, Lq3/h;->Y1()V

    goto :goto_3

    :cond_5
    invoke-direct {p0}, Lq3/h;->v1()V

    invoke-direct {p0}, Lq3/h;->u1()V

    goto :goto_3

    :cond_6
    if-eqz p1, :cond_7

    iget-object v0, p0, Lq3/h;->W0:Lq3/i;

    if-eq p1, v0, :cond_7

    invoke-direct {p0}, Lq3/h;->Q1()V

    invoke-direct {p0}, Lq3/h;->P1()V

    :cond_7
    :goto_3
    return-void
.end method

.method private e2(Lj2/n;)Z
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-boolean v0, p0, Lq3/h;->s1:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Lj2/n;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lq3/h;->w1(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean p1, p1, Lj2/n;->g:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq3/h;->M0:Landroid/content/Context;

    invoke-static {p1}, Lq3/i;->b(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static synthetic r1(Lq3/h;)Lj2/l;
    .locals 0

    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s1(Lq3/h;)V
    .locals 0

    invoke-direct {p0}, Lq3/h;->T1()V

    return-void
.end method

.method static synthetic t1(Lq3/h;Ls1/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj2/o;->g1(Ls1/q;)V

    return-void
.end method

.method private u1()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq3/h;->Z0:Z

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    iget-boolean v0, p0, Lq3/h;->s1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lq3/h$c;

    invoke-direct {v1, p0, v0}, Lq3/h$c;-><init>(Lq3/h;Lj2/l;)V

    iput-object v1, p0, Lq3/h;->u1:Lq3/h$c;

    :cond_0
    return-void
.end method

.method private v1()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lq3/h;->r1:Lq3/z;

    return-void
.end method

.method private static x1(Landroid/media/MediaFormat;I)V
    .locals 2

    const-string v0, "tunneled-playback"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/media/MediaFormat;->setFeatureEnabled(Ljava/lang/String;Z)V

    const-string v0, "audio-session-id"

    invoke-virtual {p0, v0, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method private static y1()Z
    .locals 2

    sget-object v0, Lp3/n0;->c:Ljava/lang/String;

    const-string v1, "NVIDIA"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method protected D1(Lj2/n;Ls1/n1;[Ls1/n1;)Lq3/h$b;
    .locals 12

    iget v0, p2, Ls1/n1;->z:I

    iget v1, p2, Ls1/n1;->A:I

    invoke-static {p1, p2}, Lq3/h;->F1(Lj2/n;Ls1/n1;)I

    move-result v2

    array-length v3, p3

    const/4 v4, 0x1

    const/4 v5, -0x1

    if-ne v3, v4, :cond_1

    if-eq v2, v5, :cond_0

    invoke-static {p1, p2}, Lq3/h;->B1(Lj2/n;Ls1/n1;)I

    move-result p1

    if-eq p1, v5, :cond_0

    int-to-float p2, v2

    const/high16 p3, 0x3fc00000    # 1.5f

    mul-float p2, p2, p3

    float-to-int p2, p2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_0
    new-instance p1, Lq3/h$b;

    invoke-direct {p1, v0, v1, v2}, Lq3/h$b;-><init>(III)V

    return-object p1

    :cond_1
    array-length v3, p3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v3, :cond_6

    aget-object v9, p3, v7

    iget-object v10, p2, Ls1/n1;->G:Lq3/c;

    if-eqz v10, :cond_2

    iget-object v10, v9, Ls1/n1;->G:Lq3/c;

    if-nez v10, :cond_2

    invoke-virtual {v9}, Ls1/n1;->b()Ls1/n1$b;

    move-result-object v9

    iget-object v10, p2, Ls1/n1;->G:Lq3/c;

    invoke-virtual {v9, v10}, Ls1/n1$b;->L(Lq3/c;)Ls1/n1$b;

    move-result-object v9

    invoke-virtual {v9}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v9

    :cond_2
    invoke-virtual {p1, p2, v9}, Lj2/n;->f(Ls1/n1;Ls1/n1;)Lv1/i;

    move-result-object v10

    iget v10, v10, Lv1/i;->d:I

    if-eqz v10, :cond_5

    iget v10, v9, Ls1/n1;->z:I

    if-eq v10, v5, :cond_4

    iget v11, v9, Ls1/n1;->A:I

    if-ne v11, v5, :cond_3

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v11, 0x1

    :goto_2
    or-int/2addr v8, v11

    invoke-static {v0, v10}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v10, v9, Ls1/n1;->A:I

    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {p1, v9}, Lq3/h;->F1(Lj2/n;Ls1/n1;)I

    move-result v9

    invoke-static {v2, v9}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_6
    if-eqz v8, :cond_7

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Resolutions unknown. Codec max resolution: "

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v4, "MediaCodecVideoRenderer"

    invoke-static {v4, p3}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lq3/h;->C1(Lj2/n;Ls1/n1;)Landroid/graphics/Point;

    move-result-object p3

    if-eqz p3, :cond_7

    iget v5, p3, Landroid/graphics/Point;->x:I

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget p3, p3, Landroid/graphics/Point;->y:I

    invoke-static {v1, p3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p2}, Ls1/n1;->b()Ls1/n1$b;

    move-result-object p2

    invoke-virtual {p2, v0}, Ls1/n1$b;->n0(I)Ls1/n1$b;

    move-result-object p2

    invoke-virtual {p2, v1}, Ls1/n1$b;->S(I)Ls1/n1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p2

    invoke-static {p1, p2}, Lq3/h;->B1(Lj2/n;Ls1/n1;)I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Codec max resolution adjusted to: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    new-instance p1, Lq3/h$b;

    invoke-direct {p1, v0, v1, v2}, Lq3/h$b;-><init>(III)V

    return-object p1
.end method

.method protected H()V
    .locals 3

    invoke-direct {p0}, Lq3/h;->v1()V

    invoke-direct {p0}, Lq3/h;->u1()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq3/h;->X0:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lq3/h;->u1:Lq3/h$c;

    :try_start_0
    invoke-super {p0}, Lj2/o;->H()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lq3/h;->O0:Lq3/x$a;

    iget-object v1, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {v0, v1}, Lq3/x$a;->m(Lv1/e;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lq3/h;->O0:Lq3/x$a;

    iget-object v2, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {v1, v2}, Lq3/x$a;->m(Lv1/e;)V

    throw v0
.end method

.method protected H1(Ls1/n1;Ljava/lang/String;Lq3/h$b;FZI)Landroid/media/MediaFormat;
    .locals 2

    new-instance v0, Landroid/media/MediaFormat;

    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    const-string v1, "mime"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget p2, p1, Ls1/n1;->z:I

    const-string v1, "width"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p2, p1, Ls1/n1;->A:I

    const-string v1, "height"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p2, p1, Ls1/n1;->w:Ljava/util/List;

    invoke-static {v0, p2}, Lp3/u;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    iget p2, p1, Ls1/n1;->B:F

    const-string v1, "frame-rate"

    invoke-static {v0, v1, p2}, Lp3/u;->c(Landroid/media/MediaFormat;Ljava/lang/String;F)V

    iget p2, p1, Ls1/n1;->C:I

    const-string v1, "rotation-degrees"

    invoke-static {v0, v1, p2}, Lp3/u;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    iget-object p2, p1, Ls1/n1;->G:Lq3/c;

    invoke-static {v0, p2}, Lp3/u;->b(Landroid/media/MediaFormat;Lq3/c;)V

    iget-object p2, p1, Ls1/n1;->u:Ljava/lang/String;

    const-string v1, "video/dolby-vision"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Lj2/v;->q(Ls1/n1;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const-string p2, "profile"

    invoke-static {v0, p2, p1}, Lp3/u;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    :cond_0
    iget p1, p3, Lq3/h$b;->a:I

    const-string p2, "max-width"

    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p1, p3, Lq3/h$b;->b:I

    const-string p2, "max-height"

    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p1, p3, Lq3/h$b;->c:I

    const-string p2, "max-input-size"

    invoke-static {v0, p2, p1}, Lp3/u;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    sget p1, Lp3/n0;->a:I

    const/16 p2, 0x17

    const/4 p3, 0x0

    if-lt p1, p2, :cond_1

    const-string p1, "priority"

    invoke-virtual {v0, p1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 p1, -0x40800000    # -1.0f

    cmpl-float p1, p4, p1

    if-eqz p1, :cond_1

    const-string p1, "operating-rate"

    invoke-virtual {v0, p1, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_1
    if-eqz p5, :cond_2

    const/4 p1, 0x1

    const-string p2, "no-post-process"

    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p1, "auto-frc"

    invoke-virtual {v0, p1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_2
    if-eqz p6, :cond_3

    invoke-static {v0, p6}, Lq3/h;->x1(Landroid/media/MediaFormat;I)V

    :cond_3
    return-object v0
.end method

.method protected I(ZZ)V
    .locals 2

    invoke-super {p0, p1, p2}, Lj2/o;->I(ZZ)V

    invoke-virtual {p0}, Ls1/f;->B()Ls1/o3;

    move-result-object p1

    iget-boolean p1, p1, Ls1/o3;->a:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget v1, p0, Lq3/h;->t1:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lp3/a;->f(Z)V

    iget-boolean v1, p0, Lq3/h;->s1:Z

    if-eq v1, p1, :cond_2

    iput-boolean p1, p0, Lq3/h;->s1:Z

    invoke-virtual {p0}, Lj2/o;->X0()V

    :cond_2
    iget-object p1, p0, Lq3/h;->O0:Lq3/x$a;

    iget-object v1, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {p1, v1}, Lq3/x$a;->o(Lv1/e;)V

    iput-boolean p2, p0, Lq3/h;->a1:Z

    iput-boolean v0, p0, Lq3/h;->b1:Z

    return-void
.end method

.method protected J(JZ)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lj2/o;->J(JZ)V

    invoke-direct {p0}, Lq3/h;->u1()V

    iget-object p1, p0, Lq3/h;->N0:Lq3/l;

    invoke-virtual {p1}, Lq3/l;->j()V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lq3/h;->i1:J

    iput-wide p1, p0, Lq3/h;->c1:J

    const/4 v0, 0x0

    iput v0, p0, Lq3/h;->g1:I

    if-eqz p3, :cond_0

    invoke-direct {p0}, Lq3/h;->Y1()V

    goto :goto_0

    :cond_0
    iput-wide p1, p0, Lq3/h;->d1:J

    :goto_0
    return-void
.end method

.method protected J0(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecVideoRenderer"

    const-string v1, "Video codec error"

    invoke-static {v0, v1, p1}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lq3/h;->O0:Lq3/x$a;

    invoke-virtual {v0, p1}, Lq3/x$a;->C(Ljava/lang/Exception;)V

    return-void
.end method

.method protected K()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lj2/o;->K()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lq3/h;->W0:Lq3/i;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lq3/h;->U1()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lq3/h;->W0:Lq3/i;

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lq3/h;->U1()V

    :cond_1
    throw v0
.end method

.method protected K0(Ljava/lang/String;Lj2/l$a;JJ)V
    .locals 6

    iget-object v0, p0, Lq3/h;->O0:Lq3/x$a;

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lq3/x$a;->k(Ljava/lang/String;JJ)V

    invoke-virtual {p0, p1}, Lq3/h;->w1(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lq3/h;->T0:Z

    invoke-virtual {p0}, Lj2/o;->q0()Lj2/n;

    move-result-object p1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj2/n;

    invoke-virtual {p1}, Lj2/n;->p()Z

    move-result p1

    iput-boolean p1, p0, Lq3/h;->U0:Z

    sget p1, Lp3/n0;->a:I

    const/16 p2, 0x17

    if-lt p1, p2, :cond_0

    iget-boolean p1, p0, Lq3/h;->s1:Z

    if-eqz p1, :cond_0

    new-instance p1, Lq3/h$c;

    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object p2

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj2/l;

    invoke-direct {p1, p0, p2}, Lq3/h$c;-><init>(Lq3/h;Lj2/l;)V

    iput-object p1, p0, Lq3/h;->u1:Lq3/h$c;

    :cond_0
    return-void
.end method

.method protected K1(JZ)Z
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls1/f;->Q(J)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x1

    if-eqz p3, :cond_1

    iget-object p3, p0, Lj2/o;->H0:Lv1/e;

    iget v0, p3, Lv1/e;->d:I

    add-int/2addr v0, p1

    iput v0, p3, Lv1/e;->d:I

    iget p1, p3, Lv1/e;->f:I

    iget v0, p0, Lq3/h;->h1:I

    add-int/2addr p1, v0

    iput p1, p3, Lv1/e;->f:I

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lj2/o;->H0:Lv1/e;

    iget v0, p3, Lv1/e;->j:I

    add-int/2addr v0, p2

    iput v0, p3, Lv1/e;->j:I

    iget p3, p0, Lq3/h;->h1:I

    invoke-virtual {p0, p1, p3}, Lq3/h;->g2(II)V

    :goto_0
    invoke-virtual {p0}, Lj2/o;->m0()Z

    return p2
.end method

.method protected L()V
    .locals 5

    invoke-super {p0}, Lj2/o;->L()V

    const/4 v0, 0x0

    iput v0, p0, Lq3/h;->f1:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, Lq3/h;->e1:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    iput-wide v1, p0, Lq3/h;->j1:J

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lq3/h;->k1:J

    iput v0, p0, Lq3/h;->l1:I

    iget-object v0, p0, Lq3/h;->N0:Lq3/l;

    invoke-virtual {v0}, Lq3/l;->k()V

    return-void
.end method

.method protected L0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lq3/h;->O0:Lq3/x$a;

    invoke-virtual {v0, p1}, Lq3/x$a;->l(Ljava/lang/String;)V

    return-void
.end method

.method protected M()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lq3/h;->d1:J

    invoke-direct {p0}, Lq3/h;->L1()V

    invoke-direct {p0}, Lq3/h;->N1()V

    iget-object v0, p0, Lq3/h;->N0:Lq3/l;

    invoke-virtual {v0}, Lq3/l;->l()V

    invoke-super {p0}, Lj2/o;->M()V

    return-void
.end method

.method protected M0(Ls1/o1;)Lv1/i;
    .locals 2

    invoke-super {p0, p1}, Lj2/o;->M0(Ls1/o1;)Lv1/i;

    move-result-object v0

    iget-object v1, p0, Lq3/h;->O0:Lq3/x$a;

    iget-object p1, p1, Ls1/o1;->b:Ls1/n1;

    invoke-virtual {v1, p1, v0}, Lq3/x$a;->p(Ls1/n1;Lv1/i;)V

    return-object v0
.end method

.method M1()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq3/h;->b1:Z

    iget-boolean v1, p0, Lq3/h;->Z0:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lq3/h;->Z0:Z

    iget-object v1, p0, Lq3/h;->O0:Lq3/x$a;

    iget-object v2, p0, Lq3/h;->V0:Landroid/view/Surface;

    invoke-virtual {v1, v2}, Lq3/x$a;->A(Ljava/lang/Object;)V

    iput-boolean v0, p0, Lq3/h;->X0:Z

    :cond_0
    return-void
.end method

.method protected N0(Ls1/n1;Landroid/media/MediaFormat;)V
    .locals 6

    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, p0, Lq3/h;->Y0:I

    invoke-interface {v0, v1}, Lj2/l;->f(I)V

    :cond_0
    iget-boolean v0, p0, Lq3/h;->s1:Z

    if-eqz v0, :cond_1

    iget p2, p1, Ls1/n1;->z:I

    iput p2, p0, Lq3/h;->n1:I

    iget p2, p1, Ls1/n1;->A:I

    iput p2, p0, Lq3/h;->o1:I

    goto :goto_3

    :cond_1
    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "crop-right"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "crop-top"

    const-string v3, "crop-bottom"

    const-string v4, "crop-left"

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v4

    sub-int/2addr v0, v4

    add-int/2addr v0, v5

    goto :goto_1

    :cond_3
    const-string v0, "width"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_1
    iput v0, p0, Lq3/h;->n1:I

    if-eqz v1, :cond_4

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    sub-int/2addr v0, p2

    add-int/2addr v0, v5

    goto :goto_2

    :cond_4
    const-string v0, "height"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_2
    iput v0, p0, Lq3/h;->o1:I

    :goto_3
    iget p2, p1, Ls1/n1;->D:F

    iput p2, p0, Lq3/h;->q1:F

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_6

    iget v0, p1, Ls1/n1;->C:I

    const/16 v1, 0x5a

    if-eq v0, v1, :cond_5

    const/16 v1, 0x10e

    if-ne v0, v1, :cond_7

    :cond_5
    iget v0, p0, Lq3/h;->n1:I

    iget v1, p0, Lq3/h;->o1:I

    iput v1, p0, Lq3/h;->n1:I

    iput v0, p0, Lq3/h;->o1:I

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p2

    iput v0, p0, Lq3/h;->q1:F

    goto :goto_4

    :cond_6
    iget p2, p1, Ls1/n1;->C:I

    iput p2, p0, Lq3/h;->p1:I

    :cond_7
    :goto_4
    iget-object p2, p0, Lq3/h;->N0:Lq3/l;

    iget p1, p1, Ls1/n1;->B:F

    invoke-virtual {p2, p1}, Lq3/l;->g(F)V

    return-void
.end method

.method protected P0(J)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj2/o;->P0(J)V

    iget-boolean p1, p0, Lq3/h;->s1:Z

    if-nez p1, :cond_0

    iget p1, p0, Lq3/h;->h1:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lq3/h;->h1:I

    :cond_0
    return-void
.end method

.method protected Q0()V
    .locals 0

    invoke-super {p0}, Lj2/o;->Q0()V

    invoke-direct {p0}, Lq3/h;->u1()V

    return-void
.end method

.method protected R0(Lv1/g;)V
    .locals 3

    iget-boolean v0, p0, Lq3/h;->s1:Z

    if-nez v0, :cond_0

    iget v1, p0, Lq3/h;->h1:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq3/h;->h1:I

    :cond_0
    sget v1, Lp3/n0;->a:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_1

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lv1/g;->n:J

    invoke-virtual {p0, v0, v1}, Lq3/h;->S1(J)V

    :cond_1
    return-void
.end method

.method protected S1(J)V
    .locals 2

    invoke-virtual {p0, p1, p2}, Lj2/o;->q1(J)V

    invoke-direct {p0}, Lq3/h;->O1()V

    iget-object v0, p0, Lj2/o;->H0:Lv1/e;

    iget v1, v0, Lv1/e;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lv1/e;->e:I

    invoke-virtual {p0}, Lq3/h;->M1()V

    invoke-virtual {p0, p1, p2}, Lq3/h;->P0(J)V

    return-void
.end method

.method protected T(Lj2/n;Ls1/n1;Ls1/n1;)Lv1/i;
    .locals 8

    invoke-virtual {p1, p2, p3}, Lj2/n;->f(Ls1/n1;Ls1/n1;)Lv1/i;

    move-result-object v0

    iget v1, v0, Lv1/i;->e:I

    iget v2, p3, Ls1/n1;->z:I

    iget-object v3, p0, Lq3/h;->S0:Lq3/h$b;

    iget v4, v3, Lq3/h$b;->a:I

    if-gt v2, v4, :cond_0

    iget v2, p3, Ls1/n1;->A:I

    iget v3, v3, Lq3/h$b;->b:I

    if-le v2, v3, :cond_1

    :cond_0
    or-int/lit16 v1, v1, 0x100

    :cond_1
    invoke-static {p1, p3}, Lq3/h;->F1(Lj2/n;Ls1/n1;)I

    move-result v2

    iget-object v3, p0, Lq3/h;->S0:Lq3/h$b;

    iget v3, v3, Lq3/h$b;->c:I

    if-le v2, v3, :cond_2

    or-int/lit8 v1, v1, 0x40

    :cond_2
    move v7, v1

    new-instance v1, Lv1/i;

    iget-object v3, p1, Lj2/n;->a:Ljava/lang/String;

    if-eqz v7, :cond_3

    const/4 p1, 0x0

    const/4 v6, 0x0

    goto :goto_0

    :cond_3
    iget p1, v0, Lv1/i;->d:I

    move v6, p1

    :goto_0
    move-object v2, v1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lv1/i;-><init>(Ljava/lang/String;Ls1/n1;Ls1/n1;II)V

    return-object v1
.end method

.method protected T0(JJLj2/l;Ljava/nio/ByteBuffer;IIIJZZLs1/n1;)Z
    .locals 21

    move-object/from16 v6, p0

    move-wide/from16 v7, p1

    move-object/from16 v9, p5

    move/from16 v10, p7

    move-wide/from16 v0, p10

    invoke-static/range {p5 .. p5}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v2, v6, Lq3/h;->c1:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v11, v2, v4

    if-nez v11, :cond_0

    iput-wide v7, v6, Lq3/h;->c1:J

    :cond_0
    iget-wide v2, v6, Lq3/h;->i1:J

    cmp-long v11, v0, v2

    if-eqz v11, :cond_1

    iget-object v2, v6, Lq3/h;->N0:Lq3/l;

    invoke-virtual {v2, v0, v1}, Lq3/l;->h(J)V

    iput-wide v0, v6, Lq3/h;->i1:J

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lj2/o;->x0()J

    move-result-wide v2

    sub-long v11, v0, v2

    const/4 v13, 0x1

    if-eqz p12, :cond_2

    if-nez p13, :cond_2

    invoke-virtual {v6, v9, v10, v11, v12}, Lq3/h;->f2(Lj2/l;IJ)V

    return v13

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lj2/o;->y0()F

    move-result v14

    float-to-double v14, v14

    invoke-virtual/range {p0 .. p0}, Ls1/f;->getState()I

    move-result v4

    const/4 v5, 0x2

    const/16 v16, 0x0

    if-ne v4, v5, :cond_3

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v17

    const-wide/16 v19, 0x3e8

    mul-long v17, v17, v19

    sub-long/2addr v0, v7

    long-to-double v0, v0

    div-double/2addr v0, v14

    double-to-long v0, v0

    if-eqz v4, :cond_4

    sub-long v14, v17, p3

    sub-long/2addr v0, v14

    :cond_4
    iget-object v5, v6, Lq3/h;->V0:Landroid/view/Surface;

    iget-object v14, v6, Lq3/h;->W0:Lq3/i;

    if-ne v5, v14, :cond_6

    invoke-static {v0, v1}, Lq3/h;->I1(J)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v6, v9, v10, v11, v12}, Lq3/h;->f2(Lj2/l;IJ)V

    invoke-virtual {v6, v0, v1}, Lq3/h;->h2(J)V

    return v13

    :cond_5
    return v16

    :cond_6
    iget-wide v14, v6, Lq3/h;->j1:J

    sub-long v14, v17, v14

    iget-boolean v5, v6, Lq3/h;->b1:Z

    if-nez v5, :cond_7

    if-nez v4, :cond_8

    iget-boolean v5, v6, Lq3/h;->a1:Z

    if-eqz v5, :cond_9

    goto :goto_1

    :cond_7
    iget-boolean v5, v6, Lq3/h;->Z0:Z

    if-nez v5, :cond_9

    :cond_8
    :goto_1
    move-wide/from16 p10, v14

    const/4 v5, 0x1

    goto :goto_2

    :cond_9
    move-wide/from16 p10, v14

    const/4 v5, 0x0

    :goto_2
    iget-wide v13, v6, Lq3/h;->d1:J

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v15, v13, v17

    if-nez v15, :cond_b

    cmp-long v13, v7, v2

    if-ltz v13, :cond_b

    if-nez v5, :cond_a

    if-eqz v4, :cond_b

    move-wide/from16 v2, p10

    invoke-virtual {v6, v0, v1, v2, v3}, Lq3/h;->d2(JJ)Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_a
    const/4 v2, 0x1

    goto :goto_3

    :cond_b
    const/4 v2, 0x0

    :goto_3
    const/16 v13, 0x15

    if-eqz v2, :cond_c

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    move-object/from16 p8, p0

    move-wide/from16 p9, v11

    move-wide/from16 p11, v2

    move-object/from16 p13, p14

    invoke-direct/range {p8 .. p13}, Lq3/h;->R1(JJLs1/n1;)V

    sget v4, Lp3/n0;->a:I

    if-lt v4, v13, :cond_15

    move-object/from16 p8, p0

    move-object/from16 p9, p5

    move/from16 p10, p7

    move-wide/from16 p11, v11

    move-wide/from16 p13, v2

    invoke-virtual/range {p8 .. p14}, Lq3/h;->W1(Lj2/l;IJJ)V

    :goto_4
    invoke-virtual {v6, v0, v1}, Lq3/h;->h2(J)V

    :goto_5
    const/4 v0, 0x1

    return v0

    :cond_c
    if-eqz v4, :cond_16

    iget-wide v2, v6, Lq3/h;->c1:J

    cmp-long v4, v7, v2

    if-nez v4, :cond_d

    goto/16 :goto_a

    :cond_d
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    mul-long v0, v0, v19

    add-long/2addr v0, v2

    iget-object v4, v6, Lq3/h;->N0:Lq3/l;

    invoke-virtual {v4, v0, v1}, Lq3/l;->b(J)J

    move-result-wide v14

    sub-long v0, v14, v2

    div-long v3, v0, v19

    iget-wide v0, v6, Lq3/h;->d1:J

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v17

    if-eqz v2, :cond_e

    const/4 v5, 0x1

    goto :goto_6

    :cond_e
    const/4 v5, 0x0

    :goto_6
    move-object/from16 v0, p0

    move-wide v1, v3

    move-wide/from16 v17, v3

    move-wide/from16 v3, p3

    move v13, v5

    move/from16 v5, p13

    invoke-virtual/range {v0 .. v5}, Lq3/h;->b2(JJZ)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v6, v7, v8, v13}, Lq3/h;->K1(JZ)Z

    move-result v0

    if-eqz v0, :cond_f

    return v16

    :cond_f
    move-object/from16 v0, p0

    move-wide/from16 v1, v17

    move-wide/from16 v3, p3

    move/from16 v5, p13

    invoke-virtual/range {v0 .. v5}, Lq3/h;->c2(JJZ)Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz v13, :cond_10

    invoke-virtual {v6, v9, v10, v11, v12}, Lq3/h;->f2(Lj2/l;IJ)V

    goto :goto_7

    :cond_10
    invoke-virtual {v6, v9, v10, v11, v12}, Lq3/h;->z1(Lj2/l;IJ)V

    :goto_7
    move-wide/from16 v0, v17

    goto :goto_4

    :cond_11
    move-wide/from16 v0, v17

    sget v2, Lp3/n0;->a:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_13

    const-wide/32 v2, 0xc350

    cmp-long v4, v0, v2

    if-gez v4, :cond_16

    iget-wide v2, v6, Lq3/h;->m1:J

    cmp-long v4, v14, v2

    if-nez v4, :cond_12

    invoke-virtual {v6, v9, v10, v11, v12}, Lq3/h;->f2(Lj2/l;IJ)V

    goto :goto_8

    :cond_12
    move-object/from16 p8, p0

    move-wide/from16 p9, v11

    move-wide/from16 p11, v14

    move-object/from16 p13, p14

    invoke-direct/range {p8 .. p13}, Lq3/h;->R1(JJLs1/n1;)V

    move-object/from16 p9, p5

    move/from16 p10, p7

    move-wide/from16 p11, v11

    move-wide/from16 p13, v14

    invoke-virtual/range {p8 .. p14}, Lq3/h;->W1(Lj2/l;IJJ)V

    :goto_8
    invoke-virtual {v6, v0, v1}, Lq3/h;->h2(J)V

    iput-wide v14, v6, Lq3/h;->m1:J

    goto/16 :goto_5

    :cond_13
    const-wide/16 v2, 0x7530

    cmp-long v4, v0, v2

    if-gez v4, :cond_16

    const-wide/16 v2, 0x2af8

    cmp-long v4, v0, v2

    if-lez v4, :cond_14

    const-wide/16 v2, 0x2710

    sub-long v3, v0, v2

    :try_start_0
    div-long v3, v3, v19

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return v16

    :cond_14
    :goto_9
    move-object/from16 p8, p0

    move-wide/from16 p9, v11

    move-wide/from16 p11, v14

    move-object/from16 p13, p14

    invoke-direct/range {p8 .. p13}, Lq3/h;->R1(JJLs1/n1;)V

    :cond_15
    invoke-virtual {v6, v9, v10, v11, v12}, Lq3/h;->V1(Lj2/l;IJ)V

    goto/16 :goto_4

    :cond_16
    :goto_a
    return v16
.end method

.method protected V1(Lj2/l;IJ)V
    .locals 2

    invoke-direct {p0}, Lq3/h;->O1()V

    const-string p3, "releaseOutputBuffer"

    invoke-static {p3}, Lp3/k0;->a(Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-interface {p1, p2, p3}, Lj2/l;->d(IZ)V

    invoke-static {}, Lp3/k0;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    iput-wide p1, p0, Lq3/h;->j1:J

    iget-object p1, p0, Lj2/o;->H0:Lv1/e;

    iget p2, p1, Lv1/e;->e:I

    add-int/2addr p2, p3

    iput p2, p1, Lv1/e;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lq3/h;->g1:I

    invoke-virtual {p0}, Lq3/h;->M1()V

    return-void
.end method

.method protected W1(Lj2/l;IJJ)V
    .locals 0

    invoke-direct {p0}, Lq3/h;->O1()V

    const-string p3, "releaseOutputBuffer"

    invoke-static {p3}, Lp3/k0;->a(Ljava/lang/String;)V

    invoke-interface {p1, p2, p5, p6}, Lj2/l;->n(IJ)V

    invoke-static {}, Lp3/k0;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 p3, 0x3e8

    mul-long p1, p1, p3

    iput-wide p1, p0, Lq3/h;->j1:J

    iget-object p1, p0, Lj2/o;->H0:Lv1/e;

    iget p2, p1, Lv1/e;->e:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lv1/e;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lq3/h;->g1:I

    invoke-virtual {p0}, Lq3/h;->M1()V

    return-void
.end method

.method protected Z0()V
    .locals 1

    invoke-super {p0}, Lj2/o;->Z0()V

    const/4 v0, 0x0

    iput v0, p0, Lq3/h;->h1:I

    return-void
.end method

.method protected a2(Lj2/l;Landroid/view/Surface;)V
    .locals 0

    invoke-interface {p1, p2}, Lj2/l;->i(Landroid/view/Surface;)V

    return-void
.end method

.method protected b2(JJZ)Z
    .locals 0

    invoke-static {p1, p2}, Lq3/h;->J1(J)Z

    move-result p1

    if-eqz p1, :cond_0

    if-nez p5, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected c2(JJZ)Z
    .locals 0

    invoke-static {p1, p2}, Lq3/h;->I1(J)Z

    move-result p1

    if-eqz p1, :cond_0

    if-nez p5, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d()Z
    .locals 9

    invoke-super {p0}, Lj2/o;->d()Z

    move-result v0

    const/4 v1, 0x1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lq3/h;->Z0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lq3/h;->W0:Lq3/i;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lq3/h;->V0:Landroid/view/Surface;

    if-eq v4, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lq3/h;->s1:Z

    if-eqz v0, :cond_2

    :cond_1
    iput-wide v2, p0, Lq3/h;->d1:J

    return v1

    :cond_2
    iget-wide v4, p0, Lq3/h;->d1:J

    const/4 v0, 0x0

    cmp-long v6, v4, v2

    if-nez v6, :cond_3

    return v0

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Lq3/h;->d1:J

    cmp-long v8, v4, v6

    if-gez v8, :cond_4

    return v1

    :cond_4
    iput-wide v2, p0, Lq3/h;->d1:J

    return v0
.end method

.method protected d0(Ljava/lang/Throwable;Lj2/n;)Lj2/m;
    .locals 2

    new-instance v0, Lq3/g;

    iget-object v1, p0, Lq3/h;->V0:Landroid/view/Surface;

    invoke-direct {v0, p1, p2, v1}, Lq3/g;-><init>(Ljava/lang/Throwable;Lj2/n;Landroid/view/Surface;)V

    return-object v0
.end method

.method protected d2(JJ)Z
    .locals 1

    invoke-static {p1, p2}, Lq3/h;->I1(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/32 p1, 0x186a0

    cmp-long v0, p3, p1

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecVideoRenderer"

    return-object v0
.end method

.method protected f2(Lj2/l;IJ)V
    .locals 0

    const-string p3, "skipVideoBuffer"

    invoke-static {p3}, Lp3/k0;->a(Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-interface {p1, p2, p3}, Lj2/l;->d(IZ)V

    invoke-static {}, Lp3/k0;->c()V

    iget-object p1, p0, Lj2/o;->H0:Lv1/e;

    iget p2, p1, Lv1/e;->f:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lv1/e;->f:I

    return-void
.end method

.method protected g2(II)V
    .locals 2

    iget-object v0, p0, Lj2/o;->H0:Lv1/e;

    iget v1, v0, Lv1/e;->h:I

    add-int/2addr v1, p1

    iput v1, v0, Lv1/e;->h:I

    add-int/2addr p1, p2

    iget p2, v0, Lv1/e;->g:I

    add-int/2addr p2, p1

    iput p2, v0, Lv1/e;->g:I

    iget p2, p0, Lq3/h;->f1:I

    add-int/2addr p2, p1

    iput p2, p0, Lq3/h;->f1:I

    iget p2, p0, Lq3/h;->g1:I

    add-int/2addr p2, p1

    iput p2, p0, Lq3/h;->g1:I

    iget p1, v0, Lv1/e;->i:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v0, Lv1/e;->i:I

    iget p1, p0, Lq3/h;->Q0:I

    if-lez p1, :cond_0

    iget p2, p0, Lq3/h;->f1:I

    if-lt p2, p1, :cond_0

    invoke-direct {p0}, Lq3/h;->L1()V

    :cond_0
    return-void
.end method

.method protected h2(J)V
    .locals 2

    iget-object v0, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {v0, p1, p2}, Lv1/e;->a(J)V

    iget-wide v0, p0, Lq3/h;->k1:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lq3/h;->k1:J

    iget p1, p0, Lq3/h;->l1:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lq3/h;->l1:I

    return-void
.end method

.method protected j1(Lj2/n;)Z
    .locals 1

    iget-object v0, p0, Lq3/h;->V0:Landroid/view/Surface;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lq3/h;->e2(Lj2/n;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public m(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2}, Ls1/f;->m(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lq3/h;->N0:Lq3/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lq3/l;->o(I)V

    goto :goto_0

    :cond_1
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lq3/h;->Y0:I

    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object p1

    if-eqz p1, :cond_5

    iget p2, p0, Lq3/h;->Y0:I

    invoke-interface {p1, p2}, Lj2/l;->f(I)V

    goto :goto_0

    :cond_2
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget p2, p0, Lq3/h;->t1:I

    if-eq p2, p1, :cond_5

    iput p1, p0, Lq3/h;->t1:I

    iget-boolean p1, p0, Lq3/h;->s1:Z

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lj2/o;->X0()V

    goto :goto_0

    :cond_3
    check-cast p2, Lq3/j;

    iput-object p2, p0, Lq3/h;->v1:Lq3/j;

    goto :goto_0

    :cond_4
    invoke-direct {p0, p2}, Lq3/h;->Z1(Ljava/lang/Object;)V

    :cond_5
    :goto_0
    return-void
.end method

.method protected m1(Lj2/q;Ls1/n1;)I
    .locals 10

    iget-object v0, p2, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0}, Lp3/v;->s(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p2, Ls1/n1;->x:Lw1/m;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lq3/h;->M0:Landroid/content/Context;

    invoke-static {v3, p1, p2, v0, v1}, Lq3/h;->E1(Landroid/content/Context;Lj2/q;Ls1/n1;ZZ)Ljava/util/List;

    move-result-object v3

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v3, p0, Lq3/h;->M0:Landroid/content/Context;

    invoke-static {v3, p1, p2, v1, v1}, Lq3/h;->E1(Landroid/content/Context;Lj2/q;Ls1/n1;ZZ)Ljava/util/List;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v2}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_3
    invoke-static {p2}, Lj2/o;->n1(Ls1/n1;)Z

    move-result v4

    if-nez v4, :cond_4

    const/4 p1, 0x2

    invoke-static {p1}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_4
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj2/n;

    invoke-virtual {v4, p2}, Lj2/n;->o(Ls1/n1;)Z

    move-result v5

    if-nez v5, :cond_6

    const/4 v6, 0x1

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_6

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lj2/n;

    invoke-virtual {v7, p2}, Lj2/n;->o(Ls1/n1;)Z

    move-result v8

    if-eqz v8, :cond_5

    move-object v4, v7

    const/4 v3, 0x0

    const/4 v5, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    const/4 v3, 0x1

    :goto_2
    if-eqz v5, :cond_7

    const/4 v6, 0x4

    goto :goto_3

    :cond_7
    const/4 v6, 0x3

    :goto_3
    invoke-virtual {v4, p2}, Lj2/n;->r(Ls1/n1;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x10

    goto :goto_4

    :cond_8
    const/16 v7, 0x8

    :goto_4
    iget-boolean v4, v4, Lj2/n;->h:Z

    if-eqz v4, :cond_9

    const/16 v4, 0x40

    goto :goto_5

    :cond_9
    const/4 v4, 0x0

    :goto_5
    if-eqz v3, :cond_a

    const/16 v3, 0x80

    goto :goto_6

    :cond_a
    const/4 v3, 0x0

    :goto_6
    sget v8, Lp3/n0;->a:I

    const/16 v9, 0x1a

    if-lt v8, v9, :cond_b

    iget-object v8, p2, Ls1/n1;->u:Ljava/lang/String;

    const-string v9, "video/dolby-vision"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v8, p0, Lq3/h;->M0:Landroid/content/Context;

    invoke-static {v8}, Lq3/h$a;->a(Landroid/content/Context;)Z

    move-result v8

    if-nez v8, :cond_b

    const/16 v3, 0x100

    :cond_b
    if-eqz v5, :cond_c

    iget-object v5, p0, Lq3/h;->M0:Landroid/content/Context;

    invoke-static {v5, p1, p2, v0, v2}, Lq3/h;->E1(Landroid/content/Context;Lj2/q;Ls1/n1;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-static {p1, p2}, Lj2/v;->u(Ljava/util/List;Ls1/n1;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj2/n;

    invoke-virtual {p1, p2}, Lj2/n;->o(Ls1/n1;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1, p2}, Lj2/n;->r(Ls1/n1;)Z

    move-result p1

    if-eqz p1, :cond_c

    const/16 v1, 0x20

    :cond_c
    invoke-static {v6, v7, v1, v4, v3}, Ls1/m3;->c(IIIII)I

    move-result p1

    return p1
.end method

.method protected r0()Z
    .locals 2

    iget-boolean v0, p0, Lq3/h;->s1:Z

    if-eqz v0, :cond_0

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected s0(FLs1/n1;[Ls1/n1;)F
    .locals 5

    array-length p2, p3

    const/high16 v0, -0x40800000    # -1.0f

    const/4 v1, 0x0

    const/high16 v2, -0x40800000    # -1.0f

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v3, p3, v1

    iget v3, v3, Ls1/n1;->B:F

    cmpl-float v4, v3, v0

    if-eqz v4, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    cmpl-float p2, v2, v0

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    mul-float v0, v2, p1

    :goto_1
    return v0
.end method

.method protected u0(Lj2/q;Ls1/n1;Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/q;",
            "Ls1/n1;",
            "Z)",
            "Ljava/util/List<",
            "Lj2/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq3/h;->M0:Landroid/content/Context;

    iget-boolean v1, p0, Lq3/h;->s1:Z

    invoke-static {v0, p1, p2, p3, v1}, Lq3/h;->E1(Landroid/content/Context;Lj2/q;Ls1/n1;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lj2/v;->u(Ljava/util/List;Ls1/n1;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected w0(Lj2/n;Ls1/n1;Landroid/media/MediaCrypto;F)Lj2/l$a;
    .locals 9

    iget-object v0, p0, Lq3/h;->W0:Lq3/i;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lq3/i;->j:Z

    iget-boolean v1, p1, Lj2/n;->g:Z

    if-eq v0, v1, :cond_0

    invoke-direct {p0}, Lq3/h;->U1()V

    :cond_0
    iget-object v4, p1, Lj2/n;->c:Ljava/lang/String;

    invoke-virtual {p0}, Ls1/f;->F()[Ls1/n1;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lq3/h;->D1(Lj2/n;Ls1/n1;[Ls1/n1;)Lq3/h$b;

    move-result-object v5

    iput-object v5, p0, Lq3/h;->S0:Lq3/h$b;

    iget-boolean v7, p0, Lq3/h;->R0:Z

    iget-boolean v0, p0, Lq3/h;->s1:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lq3/h;->t1:I

    move v8, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v8, 0x0

    :goto_0
    move-object v2, p0

    move-object v3, p2

    move v6, p4

    invoke-virtual/range {v2 .. v8}, Lq3/h;->H1(Ls1/n1;Ljava/lang/String;Lq3/h$b;FZI)Landroid/media/MediaFormat;

    move-result-object p4

    iget-object v0, p0, Lq3/h;->V0:Landroid/view/Surface;

    if-nez v0, :cond_4

    invoke-direct {p0, p1}, Lq3/h;->e2(Lj2/n;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lq3/h;->W0:Lq3/i;

    if-nez v0, :cond_2

    iget-object v0, p0, Lq3/h;->M0:Landroid/content/Context;

    iget-boolean v1, p1, Lj2/n;->g:Z

    invoke-static {v0, v1}, Lq3/i;->c(Landroid/content/Context;Z)Lq3/i;

    move-result-object v0

    iput-object v0, p0, Lq3/h;->W0:Lq3/i;

    :cond_2
    iget-object v0, p0, Lq3/h;->W0:Lq3/i;

    iput-object v0, p0, Lq3/h;->V0:Landroid/view/Surface;

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_4
    :goto_1
    iget-object v0, p0, Lq3/h;->V0:Landroid/view/Surface;

    invoke-static {p1, p4, p2, v0, p3}, Lj2/l$a;->b(Lj2/n;Landroid/media/MediaFormat;Ls1/n1;Landroid/view/Surface;Landroid/media/MediaCrypto;)Lj2/l$a;

    move-result-object p1

    return-object p1
.end method

.method protected w1(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "OMX.google"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-class p1, Lq3/h;

    monitor-enter p1

    :try_start_0
    sget-boolean v0, Lq3/h;->x1:Z

    if-nez v0, :cond_1

    invoke-static {}, Lq3/h;->A1()Z

    move-result v0

    sput-boolean v0, Lq3/h;->y1:Z

    const/4 v0, 0x1

    sput-boolean v0, Lq3/h;->x1:Z

    :cond_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-boolean p1, Lq3/h;->y1:Z

    return p1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public y(FF)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj2/o;->y(FF)V

    iget-object p2, p0, Lq3/h;->N0:Lq3/l;

    invoke-virtual {p2, p1}, Lq3/l;->i(F)V

    return-void
.end method

.method protected z0(Lv1/g;)V
    .locals 7

    iget-boolean v0, p0, Lq3/h;->U0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lv1/g;->o:Ljava/nio/ByteBuffer;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/4 v1, 0x7

    if-lt v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/16 v6, -0x4b

    if-ne v0, v6, :cond_2

    const/16 v0, 0x3c

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    const/4 v1, 0x4

    if-ne v3, v1, :cond_2

    if-eqz v4, :cond_1

    if-ne v4, v0, :cond_2

    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object p1

    invoke-static {p1, v0}, Lq3/h;->X1(Lj2/l;[B)V

    :cond_2
    return-void
.end method

.method protected z1(Lj2/l;IJ)V
    .locals 0

    const-string p3, "dropVideoBuffer"

    invoke-static {p3}, Lp3/k0;->a(Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-interface {p1, p2, p3}, Lj2/l;->d(IZ)V

    invoke-static {}, Lp3/k0;->c()V

    const/4 p1, 0x1

    invoke-virtual {p0, p3, p1}, Lq3/h;->g2(II)V

    return-void
.end method

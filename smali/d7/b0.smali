.class public final Ld7/b0;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/b0$b;,
        Ld7/b0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/b0;",
        "Ld7/b0$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final ARRAY_VALUE_FIELD_NUMBER:I = 0x9

.field public static final BOOLEAN_VALUE_FIELD_NUMBER:I = 0x1

.field public static final BYTES_VALUE_FIELD_NUMBER:I = 0x12

.field private static final DEFAULT_INSTANCE:Ld7/b0;

.field public static final DOUBLE_VALUE_FIELD_NUMBER:I = 0x3

.field public static final GEO_POINT_VALUE_FIELD_NUMBER:I = 0x8

.field public static final INTEGER_VALUE_FIELD_NUMBER:I = 0x2

.field public static final MAP_VALUE_FIELD_NUMBER:I = 0x6

.field public static final NULL_VALUE_FIELD_NUMBER:I = 0xb

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/b0;",
            ">;"
        }
    .end annotation
.end field

.field public static final REFERENCE_VALUE_FIELD_NUMBER:I = 0x5

.field public static final STRING_VALUE_FIELD_NUMBER:I = 0x11

.field public static final TIMESTAMP_VALUE_FIELD_NUMBER:I = 0xa


# instance fields
.field private valueTypeCase_:I

.field private valueType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/b0;

    invoke-direct {v0}, Ld7/b0;-><init>()V

    sput-object v0, Ld7/b0;->DEFAULT_INSTANCE:Ld7/b0;

    const-class v1, Ld7/b0;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ld7/b0;->valueTypeCase_:I

    return-void
.end method

.method public static C0()Ld7/b0$b;
    .locals 1

    sget-object v0, Ld7/b0;->DEFAULT_INSTANCE:Ld7/b0;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/b0$b;

    return-object v0
.end method

.method private D0(Ld7/b;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    const/16 p1, 0x9

    iput p1, p0, Ld7/b0;->valueTypeCase_:I

    return-void
.end method

.method private E0(Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld7/b0;->valueTypeCase_:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private F0(Lcom/google/protobuf/i;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x12

    iput v0, p0, Ld7/b0;->valueTypeCase_:I

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private G0(D)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ld7/b0;->valueTypeCase_:I

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private H0(Lh7/a;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    const/16 p1, 0x8

    iput p1, p0, Ld7/b0;->valueTypeCase_:I

    return-void
.end method

.method private I0(J)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ld7/b0;->valueTypeCase_:I

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private J0(Ld7/s;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Ld7/b0;->valueTypeCase_:I

    return-void
.end method

.method private K0(Lcom/google/protobuf/e1;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/protobuf/e1;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    const/16 p1, 0xb

    iput p1, p0, Ld7/b0;->valueTypeCase_:I

    return-void
.end method

.method private L0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x5

    iput v0, p0, Ld7/b0;->valueTypeCase_:I

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private M0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x11

    iput v0, p0, Ld7/b0;->valueTypeCase_:I

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private N0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    const/16 p1, 0xa

    iput p1, p0, Ld7/b0;->valueTypeCase_:I

    return-void
.end method

.method static synthetic e0()Ld7/b0;
    .locals 1

    sget-object v0, Ld7/b0;->DEFAULT_INSTANCE:Ld7/b0;

    return-object v0
.end method

.method static synthetic f0(Ld7/b0;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->N0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method static synthetic g0(Ld7/b0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->M0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h0(Ld7/b0;Lcom/google/protobuf/i;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->F0(Lcom/google/protobuf/i;)V

    return-void
.end method

.method static synthetic i0(Ld7/b0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->L0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic j0(Ld7/b0;Lh7/a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->H0(Lh7/a;)V

    return-void
.end method

.method static synthetic k0(Ld7/b0;Ld7/b;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->D0(Ld7/b;)V

    return-void
.end method

.method static synthetic l0(Ld7/b0;Ld7/s;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->J0(Ld7/s;)V

    return-void
.end method

.method static synthetic m0(Ld7/b0;Lcom/google/protobuf/e1;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->K0(Lcom/google/protobuf/e1;)V

    return-void
.end method

.method static synthetic n0(Ld7/b0;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b0;->E0(Z)V

    return-void
.end method

.method static synthetic o0(Ld7/b0;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld7/b0;->I0(J)V

    return-void
.end method

.method static synthetic p0(Ld7/b0;D)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld7/b0;->G0(D)V

    return-void
.end method

.method public static t0()Ld7/b0;
    .locals 1

    sget-object v0, Ld7/b0;->DEFAULT_INSTANCE:Ld7/b0;

    return-object v0
.end method


# virtual methods
.method public A0()Lcom/google/protobuf/t1;
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/t1;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/t1;->h0()Lcom/google/protobuf/t1;

    move-result-object v0

    return-object v0
.end method

.method public B0()Ld7/b0$c;
    .locals 1

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    invoke-static {v0}, Ld7/b0$c;->b(I)Ld7/b0$c;

    move-result-object v0

    return-object v0
.end method

.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ld7/b0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Ld7/b0;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/b0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/b0;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/b0;->DEFAULT_INSTANCE:Ld7/b0;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/b0;->PARSER:Lcom/google/protobuf/f1;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Ld7/b0;->DEFAULT_INSTANCE:Ld7/b0;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "valueType_"

    aput-object v0, p1, p3

    const-string p3, "valueTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Ld7/s;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lh7/a;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Ld7/b;

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Lcom/google/protobuf/t1;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005\u023b\u0000\u0006<\u0000\u0008<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011\u023b\u0000\u0012=\u0000"

    sget-object p3, Ld7/b0;->DEFAULT_INSTANCE:Ld7/b0;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/b0$b;

    invoke-direct {p1, p3}, Ld7/b0$b;-><init>(Ld7/b0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/b0;

    invoke-direct {p1}, Ld7/b0;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q0()Ld7/b;
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Ld7/b;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/b;->l0()Ld7/b;

    move-result-object v0

    return-object v0
.end method

.method public r0()Z
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public s0()Lcom/google/protobuf/i;
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/16 v1, 0x12

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/i;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/protobuf/i;->k:Lcom/google/protobuf/i;

    return-object v0
.end method

.method public u0()D
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public v0()Lh7/a;
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Lh7/a;

    return-object v0

    :cond_0
    invoke-static {}, Lh7/a;->h0()Lh7/a;

    move-result-object v0

    return-object v0
.end method

.method public w0()J
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public x0()Ld7/s;
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Ld7/s;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/s;->g0()Ld7/s;

    move-result-object v0

    return-object v0
.end method

.method public y0()Ljava/lang/String;
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public z0()Ljava/lang/String;
    .locals 2

    iget v0, p0, Ld7/b0;->valueTypeCase_:I

    const/16 v1, 0x11

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/b0;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

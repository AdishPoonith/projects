.class public final Ld7/t;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/t$b;,
        Ld7/t$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/t;",
        "Ld7/t$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ld7/t;

.field public static final EXISTS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/t;",
            ">;"
        }
    .end annotation
.end field

.field public static final UPDATE_TIME_FIELD_NUMBER:I = 0x2


# instance fields
.field private conditionTypeCase_:I

.field private conditionType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/t;

    invoke-direct {v0}, Ld7/t;-><init>()V

    sput-object v0, Ld7/t;->DEFAULT_INSTANCE:Ld7/t;

    const-class v1, Ld7/t;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ld7/t;->conditionTypeCase_:I

    return-void
.end method

.method static synthetic e0()Ld7/t;
    .locals 1

    sget-object v0, Ld7/t;->DEFAULT_INSTANCE:Ld7/t;

    return-object v0
.end method

.method static synthetic f0(Ld7/t;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/t;->m0(Z)V

    return-void
.end method

.method static synthetic g0(Ld7/t;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/t;->n0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method public static i0()Ld7/t;
    .locals 1

    sget-object v0, Ld7/t;->DEFAULT_INSTANCE:Ld7/t;

    return-object v0
.end method

.method public static l0()Ld7/t$b;
    .locals 1

    sget-object v0, Ld7/t;->DEFAULT_INSTANCE:Ld7/t;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/t$b;

    return-object v0
.end method

.method private m0(Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld7/t;->conditionTypeCase_:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ld7/t;->conditionType_:Ljava/lang/Object;

    return-void
.end method

.method private n0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/t;->conditionType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Ld7/t;->conditionTypeCase_:I

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ld7/t$a;->a:[I

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
    sget-object p1, Ld7/t;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/t;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/t;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/t;->DEFAULT_INSTANCE:Ld7/t;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/t;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/t;->DEFAULT_INSTANCE:Ld7/t;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "conditionType_"

    aput-object v0, p1, p3

    const-string p3, "conditionTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lcom/google/protobuf/t1;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000"

    sget-object p3, Ld7/t;->DEFAULT_INSTANCE:Ld7/t;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/t$b;

    invoke-direct {p1, p3}, Ld7/t$b;-><init>(Ld7/t$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/t;

    invoke-direct {p1}, Ld7/t;-><init>()V

    return-object p1

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

.method public h0()Ld7/t$c;
    .locals 1

    iget v0, p0, Ld7/t;->conditionTypeCase_:I

    invoke-static {v0}, Ld7/t$c;->b(I)Ld7/t$c;

    move-result-object v0

    return-object v0
.end method

.method public j0()Z
    .locals 2

    iget v0, p0, Ld7/t;->conditionTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/t;->conditionType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k0()Lcom/google/protobuf/t1;
    .locals 2

    iget v0, p0, Ld7/t;->conditionTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/t;->conditionType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/t1;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/t1;->h0()Lcom/google/protobuf/t1;

    move-result-object v0

    return-object v0
.end method

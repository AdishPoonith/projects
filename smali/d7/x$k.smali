.class public final Ld7/x$k;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/x$k$a;,
        Ld7/x$k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/x$k;",
        "Ld7/x$k$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ld7/x$k;

.field public static final FIELD_FIELD_NUMBER:I = 0x2

.field public static final OP_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/x$k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private op_:I

.field private operandTypeCase_:I

.field private operandType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/x$k;

    invoke-direct {v0}, Ld7/x$k;-><init>()V

    sput-object v0, Ld7/x$k;->DEFAULT_INSTANCE:Ld7/x$k;

    const-class v1, Ld7/x$k;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ld7/x$k;->operandTypeCase_:I

    return-void
.end method

.method static synthetic e0()Ld7/x$k;
    .locals 1

    sget-object v0, Ld7/x$k;->DEFAULT_INSTANCE:Ld7/x$k;

    return-object v0
.end method

.method static synthetic f0(Ld7/x$k;Ld7/x$k$b;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x$k;->m0(Ld7/x$k$b;)V

    return-void
.end method

.method static synthetic g0(Ld7/x$k;Ld7/x$g;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x$k;->l0(Ld7/x$g;)V

    return-void
.end method

.method public static h0()Ld7/x$k;
    .locals 1

    sget-object v0, Ld7/x$k;->DEFAULT_INSTANCE:Ld7/x$k;

    return-object v0
.end method

.method public static k0()Ld7/x$k$a;
    .locals 1

    sget-object v0, Ld7/x$k;->DEFAULT_INSTANCE:Ld7/x$k;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/x$k$a;

    return-object v0
.end method

.method private l0(Ld7/x$g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/x$k;->operandType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Ld7/x$k;->operandTypeCase_:I

    return-void
.end method

.method private m0(Ld7/x$k$b;)V
    .locals 0

    invoke-virtual {p1}, Ld7/x$k$b;->a()I

    move-result p1

    iput p1, p0, Ld7/x$k;->op_:I

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ld7/x$a;->a:[I

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
    sget-object p1, Ld7/x$k;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/x$k;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/x$k;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/x$k;->DEFAULT_INSTANCE:Ld7/x$k;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/x$k;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/x$k;->DEFAULT_INSTANCE:Ld7/x$k;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "operandType_"

    aput-object v0, p1, p3

    const-string p3, "operandTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "op_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Ld7/x$g;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000c\u0002<\u0000"

    sget-object p3, Ld7/x$k;->DEFAULT_INSTANCE:Ld7/x$k;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/x$k$a;

    invoke-direct {p1, p3}, Ld7/x$k$a;-><init>(Ld7/x$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/x$k;

    invoke-direct {p1}, Ld7/x$k;-><init>()V

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

.method public i0()Ld7/x$g;
    .locals 2

    iget v0, p0, Ld7/x$k;->operandTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/x$k;->operandType_:Ljava/lang/Object;

    check-cast v0, Ld7/x$g;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/x$g;->g0()Ld7/x$g;

    move-result-object v0

    return-object v0
.end method

.method public j0()Ld7/x$k$b;
    .locals 1

    iget v0, p0, Ld7/x$k;->op_:I

    invoke-static {v0}, Ld7/x$k$b;->b(I)Ld7/x$k$b;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ld7/x$k$b;->p:Ld7/x$k$b;

    :cond_0
    return-object v0
.end method

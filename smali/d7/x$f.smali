.class public final Ld7/x$f;
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
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/x$f$a;,
        Ld7/x$f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/x$f;",
        "Ld7/x$f$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ld7/x$f;

.field public static final FIELD_FIELD_NUMBER:I = 0x1

.field public static final OP_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/x$f;",
            ">;"
        }
    .end annotation
.end field

.field public static final VALUE_FIELD_NUMBER:I = 0x3


# instance fields
.field private field_:Ld7/x$g;

.field private op_:I

.field private value_:Ld7/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/x$f;

    invoke-direct {v0}, Ld7/x$f;-><init>()V

    sput-object v0, Ld7/x$f;->DEFAULT_INSTANCE:Ld7/x$f;

    const-class v1, Ld7/x$f;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    return-void
.end method

.method static synthetic e0()Ld7/x$f;
    .locals 1

    sget-object v0, Ld7/x$f;->DEFAULT_INSTANCE:Ld7/x$f;

    return-object v0
.end method

.method static synthetic f0(Ld7/x$f;Ld7/x$g;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x$f;->n0(Ld7/x$g;)V

    return-void
.end method

.method static synthetic g0(Ld7/x$f;Ld7/x$f$b;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x$f;->o0(Ld7/x$f$b;)V

    return-void
.end method

.method static synthetic h0(Ld7/x$f;Ld7/b0;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x$f;->p0(Ld7/b0;)V

    return-void
.end method

.method public static i0()Ld7/x$f;
    .locals 1

    sget-object v0, Ld7/x$f;->DEFAULT_INSTANCE:Ld7/x$f;

    return-object v0
.end method

.method public static m0()Ld7/x$f$a;
    .locals 1

    sget-object v0, Ld7/x$f;->DEFAULT_INSTANCE:Ld7/x$f;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/x$f$a;

    return-object v0
.end method

.method private n0(Ld7/x$g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/x$f;->field_:Ld7/x$g;

    return-void
.end method

.method private o0(Ld7/x$f$b;)V
    .locals 0

    invoke-virtual {p1}, Ld7/x$f$b;->a()I

    move-result p1

    iput p1, p0, Ld7/x$f;->op_:I

    return-void
.end method

.method private p0(Ld7/b0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/x$f;->value_:Ld7/b0;

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
    sget-object p1, Ld7/x$f;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/x$f;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/x$f;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/x$f;->DEFAULT_INSTANCE:Ld7/x$f;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/x$f;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/x$f;->DEFAULT_INSTANCE:Ld7/x$f;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "field_"

    aput-object v0, p1, p3

    const-string p3, "op_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "value_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000c\u0003\t"

    sget-object p3, Ld7/x$f;->DEFAULT_INSTANCE:Ld7/x$f;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/x$f$a;

    invoke-direct {p1, p3}, Ld7/x$f$a;-><init>(Ld7/x$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/x$f;

    invoke-direct {p1}, Ld7/x$f;-><init>()V

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

.method public j0()Ld7/x$g;
    .locals 1

    iget-object v0, p0, Ld7/x$f;->field_:Ld7/x$g;

    if-nez v0, :cond_0

    invoke-static {}, Ld7/x$g;->g0()Ld7/x$g;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public k0()Ld7/x$f$b;
    .locals 1

    iget v0, p0, Ld7/x$f;->op_:I

    invoke-static {v0}, Ld7/x$f$b;->b(I)Ld7/x$f$b;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ld7/x$f$b;->v:Ld7/x$f$b;

    :cond_0
    return-object v0
.end method

.method public l0()Ld7/b0;
    .locals 1

    iget-object v0, p0, Ld7/x$f;->value_:Ld7/b0;

    if-nez v0, :cond_0

    invoke-static {}, Ld7/b0;->t0()Ld7/b0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

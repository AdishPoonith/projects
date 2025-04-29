.class public final Ld7/x$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/x$d$a;,
        Ld7/x$d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/x$d;",
        "Ld7/x$d$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ld7/x$d;

.field public static final FILTERS_FIELD_NUMBER:I = 0x2

.field public static final OP_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/x$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private filters_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Ld7/x$h;",
            ">;"
        }
    .end annotation
.end field

.field private op_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/x$d;

    invoke-direct {v0}, Ld7/x$d;-><init>()V

    sput-object v0, Ld7/x$d;->DEFAULT_INSTANCE:Ld7/x$d;

    const-class v1, Ld7/x$d;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    invoke-static {}, Lcom/google/protobuf/z;->H()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/x$d;->filters_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic e0()Ld7/x$d;
    .locals 1

    sget-object v0, Ld7/x$d;->DEFAULT_INSTANCE:Ld7/x$d;

    return-object v0
.end method

.method static synthetic f0(Ld7/x$d;Ld7/x$d$b;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x$d;->n0(Ld7/x$d$b;)V

    return-void
.end method

.method static synthetic g0(Ld7/x$d;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x$d;->h0(Ljava/lang/Iterable;)V

    return-void
.end method

.method private h0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ld7/x$h;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ld7/x$d;->i0()V

    iget-object v0, p0, Ld7/x$d;->filters_:Lcom/google/protobuf/d0$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->k(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private i0()V
    .locals 2

    iget-object v0, p0, Ld7/x$d;->filters_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/z;->R(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/x$d;->filters_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static j0()Ld7/x$d;
    .locals 1

    sget-object v0, Ld7/x$d;->DEFAULT_INSTANCE:Ld7/x$d;

    return-object v0
.end method

.method public static m0()Ld7/x$d$a;
    .locals 1

    sget-object v0, Ld7/x$d;->DEFAULT_INSTANCE:Ld7/x$d;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/x$d$a;

    return-object v0
.end method

.method private n0(Ld7/x$d$b;)V
    .locals 0

    invoke-virtual {p1}, Ld7/x$d$b;->a()I

    move-result p1

    iput p1, p0, Ld7/x$d;->op_:I

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
    sget-object p1, Ld7/x$d;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/x$d;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/x$d;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/x$d;->DEFAULT_INSTANCE:Ld7/x$d;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/x$d;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/x$d;->DEFAULT_INSTANCE:Ld7/x$d;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "op_"

    aput-object v0, p1, p3

    const-string p3, "filters_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Ld7/x$h;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000c\u0002\u001b"

    sget-object p3, Ld7/x$d;->DEFAULT_INSTANCE:Ld7/x$d;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/x$d$a;

    invoke-direct {p1, p3}, Ld7/x$d$a;-><init>(Ld7/x$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/x$d;

    invoke-direct {p1}, Ld7/x$d;-><init>()V

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

.method public k0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld7/x$h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld7/x$d;->filters_:Lcom/google/protobuf/d0$i;

    return-object v0
.end method

.method public l0()Ld7/x$d$b;
    .locals 1

    iget v0, p0, Ld7/x$d;->op_:I

    invoke-static {v0}, Ld7/x$d$b;->b(I)Ld7/x$d$b;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ld7/x$d$b;->n:Ld7/x$d$b;

    :cond_0
    return-object v0
.end method

.class public final Ld7/b;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Ld7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/b;",
        "Ld7/b$b;",
        ">;",
        "Ld7/c;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ld7/b;

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final VALUES_FIELD_NUMBER:I = 0x1


# instance fields
.field private values_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Ld7/b0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/b;

    invoke-direct {v0}, Ld7/b;-><init>()V

    sput-object v0, Ld7/b;->DEFAULT_INSTANCE:Ld7/b;

    const-class v1, Ld7/b;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    invoke-static {}, Lcom/google/protobuf/z;->H()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic e0()Ld7/b;
    .locals 1

    sget-object v0, Ld7/b;->DEFAULT_INSTANCE:Ld7/b;

    return-object v0
.end method

.method static synthetic f0(Ld7/b;Ld7/b0;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b;->j0(Ld7/b0;)V

    return-void
.end method

.method static synthetic g0(Ld7/b;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b;->i0(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic h0(Ld7/b;I)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/b;->p0(I)V

    return-void
.end method

.method private i0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ld7/b0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ld7/b;->k0()V

    iget-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->k(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private j0(Ld7/b0;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ld7/b;->k0()V

    iget-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private k0()V
    .locals 2

    iget-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/z;->R(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static l0()Ld7/b;
    .locals 1

    sget-object v0, Ld7/b;->DEFAULT_INSTANCE:Ld7/b;

    return-object v0
.end method

.method public static o0()Ld7/b$b;
    .locals 1

    sget-object v0, Ld7/b;->DEFAULT_INSTANCE:Ld7/b;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/b$b;

    return-object v0
.end method

.method private p0(I)V
    .locals 1

    invoke-direct {p0}, Ld7/b;->k0()V

    iget-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ld7/b$a;->a:[I

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
    sget-object p1, Ld7/b;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/b;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/b;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/b;->DEFAULT_INSTANCE:Ld7/b;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/b;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/b;->DEFAULT_INSTANCE:Ld7/b;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "values_"

    aput-object v0, p1, p3

    const-class p3, Ld7/b0;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    sget-object p3, Ld7/b;->DEFAULT_INSTANCE:Ld7/b;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/b$b;

    invoke-direct {p1, p3}, Ld7/b$b;-><init>(Ld7/b$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/b;

    invoke-direct {p1}, Ld7/b;-><init>()V

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

.method public m0(I)Ld7/b0;
    .locals 1

    iget-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld7/b0;

    return-object p1
.end method

.method public n0()I
    .locals 1

    iget-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld7/b;->values_:Lcom/google/protobuf/d0$i;

    return-object v0
.end method

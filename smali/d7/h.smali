.class public final Ld7/h;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/h;",
        "Ld7/h$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final BEFORE_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Ld7/h;

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final VALUES_FIELD_NUMBER:I = 0x1


# instance fields
.field private before_:Z

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

    new-instance v0, Ld7/h;

    invoke-direct {v0}, Ld7/h;-><init>()V

    sput-object v0, Ld7/h;->DEFAULT_INSTANCE:Ld7/h;

    const-class v1, Ld7/h;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    invoke-static {}, Lcom/google/protobuf/z;->H()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/h;->values_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic e0()Ld7/h;
    .locals 1

    sget-object v0, Ld7/h;->DEFAULT_INSTANCE:Ld7/h;

    return-object v0
.end method

.method static synthetic f0(Ld7/h;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/h;->h0(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic g0(Ld7/h;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/h;->m0(Z)V

    return-void
.end method

.method private h0(Ljava/lang/Iterable;)V
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

    invoke-direct {p0}, Ld7/h;->i0()V

    iget-object v0, p0, Ld7/h;->values_:Lcom/google/protobuf/d0$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->k(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private i0()V
    .locals 2

    iget-object v0, p0, Ld7/h;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/z;->R(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/h;->values_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static k0()Ld7/h;
    .locals 1

    sget-object v0, Ld7/h;->DEFAULT_INSTANCE:Ld7/h;

    return-object v0
.end method

.method public static l0()Ld7/h$b;
    .locals 1

    sget-object v0, Ld7/h;->DEFAULT_INSTANCE:Ld7/h;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/h$b;

    return-object v0
.end method

.method private m0(Z)V
    .locals 0

    iput-boolean p1, p0, Ld7/h;->before_:Z

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ld7/h$a;->a:[I

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
    sget-object p1, Ld7/h;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/h;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/h;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/h;->DEFAULT_INSTANCE:Ld7/h;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/h;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/h;->DEFAULT_INSTANCE:Ld7/h;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "values_"

    aput-object v0, p1, p3

    const-class p3, Ld7/b0;

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "before_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007"

    sget-object p3, Ld7/h;->DEFAULT_INSTANCE:Ld7/h;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/h$b;

    invoke-direct {p1, p3}, Ld7/h$b;-><init>(Ld7/h$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/h;

    invoke-direct {p1}, Ld7/h;-><init>()V

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

.method public j0()Z
    .locals 1

    iget-boolean v0, p0, Ld7/h;->before_:Z

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

    iget-object v0, p0, Ld7/h;->values_:Lcom/google/protobuf/d0$i;

    return-object v0
.end method

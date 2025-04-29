.class public final Ld7/d0;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/d0$b;,
        Ld7/d0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/d0;",
        "Ld7/d0$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final DATABASE_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Ld7/d0;

.field public static final LABELS_FIELD_NUMBER:I = 0x5

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/d0;",
            ">;"
        }
    .end annotation
.end field

.field public static final STREAM_ID_FIELD_NUMBER:I = 0x2

.field public static final STREAM_TOKEN_FIELD_NUMBER:I = 0x4

.field public static final WRITES_FIELD_NUMBER:I = 0x3


# instance fields
.field private database_:Ljava/lang/String;

.field private labels_:Lcom/google/protobuf/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/p0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private streamId_:Ljava/lang/String;

.field private streamToken_:Lcom/google/protobuf/i;

.field private writes_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Ld7/c0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/d0;

    invoke-direct {v0}, Ld7/d0;-><init>()V

    sput-object v0, Ld7/d0;->DEFAULT_INSTANCE:Ld7/d0;

    const-class v1, Ld7/d0;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    invoke-static {}, Lcom/google/protobuf/p0;->f()Lcom/google/protobuf/p0;

    move-result-object v0

    iput-object v0, p0, Ld7/d0;->labels_:Lcom/google/protobuf/p0;

    const-string v0, ""

    iput-object v0, p0, Ld7/d0;->database_:Ljava/lang/String;

    iput-object v0, p0, Ld7/d0;->streamId_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/z;->H()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/d0;->writes_:Lcom/google/protobuf/d0$i;

    sget-object v0, Lcom/google/protobuf/i;->k:Lcom/google/protobuf/i;

    iput-object v0, p0, Ld7/d0;->streamToken_:Lcom/google/protobuf/i;

    return-void
.end method

.method static synthetic e0()Ld7/d0;
    .locals 1

    sget-object v0, Ld7/d0;->DEFAULT_INSTANCE:Ld7/d0;

    return-object v0
.end method

.method static synthetic f0(Ld7/d0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/d0;->m0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic g0(Ld7/d0;Lcom/google/protobuf/i;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/d0;->n0(Lcom/google/protobuf/i;)V

    return-void
.end method

.method static synthetic h0(Ld7/d0;Ld7/c0;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/d0;->i0(Ld7/c0;)V

    return-void
.end method

.method private i0(Ld7/c0;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ld7/d0;->j0()V

    iget-object v0, p0, Ld7/d0;->writes_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private j0()V
    .locals 2

    iget-object v0, p0, Ld7/d0;->writes_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/z;->R(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/d0;->writes_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static k0()Ld7/d0;
    .locals 1

    sget-object v0, Ld7/d0;->DEFAULT_INSTANCE:Ld7/d0;

    return-object v0
.end method

.method public static l0()Ld7/d0$b;
    .locals 1

    sget-object v0, Ld7/d0;->DEFAULT_INSTANCE:Ld7/d0;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/d0$b;

    return-object v0
.end method

.method private m0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/d0;->database_:Ljava/lang/String;

    return-void
.end method

.method private n0(Lcom/google/protobuf/i;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/d0;->streamToken_:Lcom/google/protobuf/i;

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ld7/d0$a;->a:[I

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
    sget-object p1, Ld7/d0;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/d0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/d0;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/d0;->DEFAULT_INSTANCE:Ld7/d0;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/d0;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/d0;->DEFAULT_INSTANCE:Ld7/d0;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "database_"

    aput-object v0, p1, p3

    const-string p3, "streamId_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "writes_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Ld7/c0;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "streamToken_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "labels_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    sget-object p3, Ld7/d0$c;->a:Lcom/google/protobuf/o0;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\n\u00052"

    sget-object p3, Ld7/d0;->DEFAULT_INSTANCE:Ld7/d0;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/d0$b;

    invoke-direct {p1, p3}, Ld7/d0$b;-><init>(Ld7/d0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/d0;

    invoke-direct {p1}, Ld7/d0;-><init>()V

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

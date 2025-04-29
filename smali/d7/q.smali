.class public final Ld7/q;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/q$b;,
        Ld7/q$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/q;",
        "Ld7/q$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final ADD_TARGET_FIELD_NUMBER:I = 0x2

.field public static final DATABASE_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Ld7/q;

.field public static final LABELS_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/q;",
            ">;"
        }
    .end annotation
.end field

.field public static final REMOVE_TARGET_FIELD_NUMBER:I = 0x3


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

.field private targetChangeCase_:I

.field private targetChange_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/q;

    invoke-direct {v0}, Ld7/q;-><init>()V

    sput-object v0, Ld7/q;->DEFAULT_INSTANCE:Ld7/q;

    const-class v1, Ld7/q;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ld7/q;->targetChangeCase_:I

    invoke-static {}, Lcom/google/protobuf/p0;->f()Lcom/google/protobuf/p0;

    move-result-object v0

    iput-object v0, p0, Ld7/q;->labels_:Lcom/google/protobuf/p0;

    const-string v0, ""

    iput-object v0, p0, Ld7/q;->database_:Ljava/lang/String;

    return-void
.end method

.method static synthetic e0()Ld7/q;
    .locals 1

    sget-object v0, Ld7/q;->DEFAULT_INSTANCE:Ld7/q;

    return-object v0
.end method

.method static synthetic f0(Ld7/q;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Ld7/q;->k0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g0(Ld7/q;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/q;->o0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h0(Ld7/q;Ld7/y;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/q;->n0(Ld7/y;)V

    return-void
.end method

.method static synthetic i0(Ld7/q;I)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/q;->p0(I)V

    return-void
.end method

.method public static j0()Ld7/q;
    .locals 1

    sget-object v0, Ld7/q;->DEFAULT_INSTANCE:Ld7/q;

    return-object v0
.end method

.method private k0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Ld7/q;->l0()Lcom/google/protobuf/p0;

    move-result-object v0

    return-object v0
.end method

.method private l0()Lcom/google/protobuf/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/p0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld7/q;->labels_:Lcom/google/protobuf/p0;

    invoke-virtual {v0}, Lcom/google/protobuf/p0;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ld7/q;->labels_:Lcom/google/protobuf/p0;

    invoke-virtual {v0}, Lcom/google/protobuf/p0;->p()Lcom/google/protobuf/p0;

    move-result-object v0

    iput-object v0, p0, Ld7/q;->labels_:Lcom/google/protobuf/p0;

    :cond_0
    iget-object v0, p0, Ld7/q;->labels_:Lcom/google/protobuf/p0;

    return-object v0
.end method

.method public static m0()Ld7/q$b;
    .locals 1

    sget-object v0, Ld7/q;->DEFAULT_INSTANCE:Ld7/q;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/q$b;

    return-object v0
.end method

.method private n0(Ld7/y;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/q;->targetChange_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Ld7/q;->targetChangeCase_:I

    return-void
.end method

.method private o0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/q;->database_:Ljava/lang/String;

    return-void
.end method

.method private p0(I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ld7/q;->targetChangeCase_:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ld7/q;->targetChange_:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ld7/q$a;->a:[I

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
    sget-object p1, Ld7/q;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/q;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/q;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/q;->DEFAULT_INSTANCE:Ld7/q;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/q;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/q;->DEFAULT_INSTANCE:Ld7/q;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "targetChange_"

    aput-object v0, p1, p3

    const-string p3, "targetChangeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "database_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Ld7/y;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "labels_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    sget-object p3, Ld7/q$c;->a:Lcom/google/protobuf/o0;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u0002<\u0000\u00037\u0000\u00042"

    sget-object p3, Ld7/q;->DEFAULT_INSTANCE:Ld7/q;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/q$b;

    invoke-direct {p1, p3}, Ld7/q$b;-><init>(Ld7/q$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/q;

    invoke-direct {p1}, Ld7/q;-><init>()V

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

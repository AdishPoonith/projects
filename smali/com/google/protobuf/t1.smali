.class public final Lcom/google/protobuf/t1;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/t1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Lcom/google/protobuf/t1;",
        "Lcom/google/protobuf/t1$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/t1;

.field public static final NANOS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lcom/google/protobuf/t1;",
            ">;"
        }
    .end annotation
.end field

.field public static final SECONDS_FIELD_NUMBER:I = 0x1


# instance fields
.field private nanos_:I

.field private seconds_:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/protobuf/t1;

    invoke-direct {v0}, Lcom/google/protobuf/t1;-><init>()V

    sput-object v0, Lcom/google/protobuf/t1;->DEFAULT_INSTANCE:Lcom/google/protobuf/t1;

    const-class v1, Lcom/google/protobuf/t1;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    return-void
.end method

.method static synthetic e0()Lcom/google/protobuf/t1;
    .locals 1

    sget-object v0, Lcom/google/protobuf/t1;->DEFAULT_INSTANCE:Lcom/google/protobuf/t1;

    return-object v0
.end method

.method static synthetic f0(Lcom/google/protobuf/t1;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/t1;->m0(J)V

    return-void
.end method

.method static synthetic g0(Lcom/google/protobuf/t1;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/protobuf/t1;->l0(I)V

    return-void
.end method

.method public static h0()Lcom/google/protobuf/t1;
    .locals 1

    sget-object v0, Lcom/google/protobuf/t1;->DEFAULT_INSTANCE:Lcom/google/protobuf/t1;

    return-object v0
.end method

.method public static k0()Lcom/google/protobuf/t1$b;
    .locals 1

    sget-object v0, Lcom/google/protobuf/t1;->DEFAULT_INSTANCE:Lcom/google/protobuf/t1;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/t1$b;

    return-object v0
.end method

.method private l0(I)V
    .locals 0

    iput p1, p0, Lcom/google/protobuf/t1;->nanos_:I

    return-void
.end method

.method private m0(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/protobuf/t1;->seconds_:J

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/protobuf/t1$a;->a:[I

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
    sget-object p1, Lcom/google/protobuf/t1;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/protobuf/t1;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/protobuf/t1;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Lcom/google/protobuf/t1;->DEFAULT_INSTANCE:Lcom/google/protobuf/t1;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Lcom/google/protobuf/t1;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lcom/google/protobuf/t1;->DEFAULT_INSTANCE:Lcom/google/protobuf/t1;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "seconds_"

    aput-object v0, p1, p3

    const-string p3, "nanos_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004"

    sget-object p3, Lcom/google/protobuf/t1;->DEFAULT_INSTANCE:Lcom/google/protobuf/t1;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/protobuf/t1$b;

    invoke-direct {p1, p3}, Lcom/google/protobuf/t1$b;-><init>(Lcom/google/protobuf/t1$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/protobuf/t1;

    invoke-direct {p1}, Lcom/google/protobuf/t1;-><init>()V

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

.method public i0()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/t1;->nanos_:I

    return v0
.end method

.method public j0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/protobuf/t1;->seconds_:J

    return-wide v0
.end method

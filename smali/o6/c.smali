.class public final Lo6/c;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/c$b;,
        Lo6/c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Lo6/c;",
        "Lo6/c$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lo6/c;

.field public static final DOCUMENTS_FIELD_NUMBER:I = 0x6

.field public static final LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER:I = 0x7

.field public static final LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lo6/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final QUERY_FIELD_NUMBER:I = 0x5

.field public static final RESUME_TOKEN_FIELD_NUMBER:I = 0x3

.field public static final SNAPSHOT_VERSION_FIELD_NUMBER:I = 0x2

.field public static final TARGET_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private lastLimboFreeSnapshotVersion_:Lcom/google/protobuf/t1;

.field private lastListenSequenceNumber_:J

.field private resumeToken_:Lcom/google/protobuf/i;

.field private snapshotVersion_:Lcom/google/protobuf/t1;

.field private targetId_:I

.field private targetTypeCase_:I

.field private targetType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo6/c;

    invoke-direct {v0}, Lo6/c;-><init>()V

    sput-object v0, Lo6/c;->DEFAULT_INSTANCE:Lo6/c;

    const-class v1, Lo6/c;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo6/c;->targetTypeCase_:I

    sget-object v0, Lcom/google/protobuf/i;->k:Lcom/google/protobuf/i;

    iput-object v0, p0, Lo6/c;->resumeToken_:Lcom/google/protobuf/i;

    return-void
.end method

.method private A0(J)V
    .locals 0

    iput-wide p1, p0, Lo6/c;->lastListenSequenceNumber_:J

    return-void
.end method

.method private B0(Ld7/y$d;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo6/c;->targetType_:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Lo6/c;->targetTypeCase_:I

    return-void
.end method

.method private C0(Lcom/google/protobuf/i;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo6/c;->resumeToken_:Lcom/google/protobuf/i;

    return-void
.end method

.method private D0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo6/c;->snapshotVersion_:Lcom/google/protobuf/t1;

    return-void
.end method

.method private E0(I)V
    .locals 0

    iput p1, p0, Lo6/c;->targetId_:I

    return-void
.end method

.method static synthetic e0()Lo6/c;
    .locals 1

    sget-object v0, Lo6/c;->DEFAULT_INSTANCE:Lo6/c;

    return-object v0
.end method

.method static synthetic f0(Lo6/c;Ld7/y$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/c;->B0(Ld7/y$d;)V

    return-void
.end method

.method static synthetic g0(Lo6/c;Ld7/y$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/c;->y0(Ld7/y$c;)V

    return-void
.end method

.method static synthetic h0(Lo6/c;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/c;->z0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method static synthetic i0(Lo6/c;)V
    .locals 0

    invoke-direct {p0}, Lo6/c;->n0()V

    return-void
.end method

.method static synthetic j0(Lo6/c;I)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/c;->E0(I)V

    return-void
.end method

.method static synthetic k0(Lo6/c;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/c;->D0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method static synthetic l0(Lo6/c;Lcom/google/protobuf/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/c;->C0(Lcom/google/protobuf/i;)V

    return-void
.end method

.method static synthetic m0(Lo6/c;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo6/c;->A0(J)V

    return-void
.end method

.method private n0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lo6/c;->lastLimboFreeSnapshotVersion_:Lcom/google/protobuf/t1;

    return-void
.end method

.method public static w0()Lo6/c$b;
    .locals 1

    sget-object v0, Lo6/c;->DEFAULT_INSTANCE:Lo6/c;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Lo6/c$b;

    return-object v0
.end method

.method public static x0([B)Lo6/c;
    .locals 1

    sget-object v0, Lo6/c;->DEFAULT_INSTANCE:Lo6/c;

    invoke-static {v0, p0}, Lcom/google/protobuf/z;->X(Lcom/google/protobuf/z;[B)Lcom/google/protobuf/z;

    move-result-object p0

    check-cast p0, Lo6/c;

    return-object p0
.end method

.method private y0(Ld7/y$c;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo6/c;->targetType_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lo6/c;->targetTypeCase_:I

    return-void
.end method

.method private z0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo6/c;->lastLimboFreeSnapshotVersion_:Lcom/google/protobuf/t1;

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lo6/c$a;->a:[I

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
    sget-object p1, Lo6/c;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lo6/c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo6/c;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Lo6/c;->DEFAULT_INSTANCE:Lo6/c;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Lo6/c;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lo6/c;->DEFAULT_INSTANCE:Lo6/c;

    return-object p1

    :pswitch_4
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "targetType_"

    aput-object v0, p1, p3

    const-string p3, "targetTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "targetId_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "snapshotVersion_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "resumeToken_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "lastListenSequenceNumber_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-class p3, Ld7/y$d;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, Ld7/y$c;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "lastLimboFreeSnapshotVersion_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t"

    sget-object p3, Lo6/c;->DEFAULT_INSTANCE:Lo6/c;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lo6/c$b;

    invoke-direct {p1, p3}, Lo6/c$b;-><init>(Lo6/c$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lo6/c;

    invoke-direct {p1}, Lo6/c;-><init>()V

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

.method public o0()Ld7/y$c;
    .locals 2

    iget v0, p0, Lo6/c;->targetTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo6/c;->targetType_:Ljava/lang/Object;

    check-cast v0, Ld7/y$c;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/y$c;->i0()Ld7/y$c;

    move-result-object v0

    return-object v0
.end method

.method public p0()Lcom/google/protobuf/t1;
    .locals 1

    iget-object v0, p0, Lo6/c;->lastLimboFreeSnapshotVersion_:Lcom/google/protobuf/t1;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/t1;->h0()Lcom/google/protobuf/t1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public q0()J
    .locals 2

    iget-wide v0, p0, Lo6/c;->lastListenSequenceNumber_:J

    return-wide v0
.end method

.method public r0()Ld7/y$d;
    .locals 2

    iget v0, p0, Lo6/c;->targetTypeCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo6/c;->targetType_:Ljava/lang/Object;

    check-cast v0, Ld7/y$d;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/y$d;->h0()Ld7/y$d;

    move-result-object v0

    return-object v0
.end method

.method public s0()Lcom/google/protobuf/i;
    .locals 1

    iget-object v0, p0, Lo6/c;->resumeToken_:Lcom/google/protobuf/i;

    return-object v0
.end method

.method public t0()Lcom/google/protobuf/t1;
    .locals 1

    iget-object v0, p0, Lo6/c;->snapshotVersion_:Lcom/google/protobuf/t1;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/t1;->h0()Lcom/google/protobuf/t1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public u0()I
    .locals 1

    iget v0, p0, Lo6/c;->targetId_:I

    return v0
.end method

.method public v0()Lo6/c$c;
    .locals 1

    iget v0, p0, Lo6/c;->targetTypeCase_:I

    invoke-static {v0}, Lo6/c$c;->b(I)Lo6/c$c;

    move-result-object v0

    return-object v0
.end method

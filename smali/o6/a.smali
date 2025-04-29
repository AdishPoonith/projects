.class public final Lo6/a;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/a$b;,
        Lo6/a$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Lo6/a;",
        "Lo6/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lo6/a;

.field public static final DOCUMENT_FIELD_NUMBER:I = 0x2

.field public static final HAS_COMMITTED_MUTATIONS_FIELD_NUMBER:I = 0x4

.field public static final NO_DOCUMENT_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lo6/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final UNKNOWN_DOCUMENT_FIELD_NUMBER:I = 0x3


# instance fields
.field private documentTypeCase_:I

.field private documentType_:Ljava/lang/Object;

.field private hasCommittedMutations_:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo6/a;

    invoke-direct {v0}, Lo6/a;-><init>()V

    sput-object v0, Lo6/a;->DEFAULT_INSTANCE:Lo6/a;

    const-class v1, Lo6/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo6/a;->documentTypeCase_:I

    return-void
.end method

.method static synthetic e0()Lo6/a;
    .locals 1

    sget-object v0, Lo6/a;->DEFAULT_INSTANCE:Lo6/a;

    return-object v0
.end method

.method static synthetic f0(Lo6/a;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/a;->r0(Z)V

    return-void
.end method

.method static synthetic g0(Lo6/a;Lo6/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/a;->s0(Lo6/b;)V

    return-void
.end method

.method static synthetic h0(Lo6/a;Ld7/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/a;->q0(Ld7/i;)V

    return-void
.end method

.method static synthetic i0(Lo6/a;Lo6/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lo6/a;->t0(Lo6/d;)V

    return-void
.end method

.method public static o0()Lo6/a$b;
    .locals 1

    sget-object v0, Lo6/a;->DEFAULT_INSTANCE:Lo6/a;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Lo6/a$b;

    return-object v0
.end method

.method public static p0([B)Lo6/a;
    .locals 1

    sget-object v0, Lo6/a;->DEFAULT_INSTANCE:Lo6/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/z;->X(Lcom/google/protobuf/z;[B)Lcom/google/protobuf/z;

    move-result-object p0

    check-cast p0, Lo6/a;

    return-object p0
.end method

.method private q0(Ld7/i;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo6/a;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lo6/a;->documentTypeCase_:I

    return-void
.end method

.method private r0(Z)V
    .locals 0

    iput-boolean p1, p0, Lo6/a;->hasCommittedMutations_:Z

    return-void
.end method

.method private s0(Lo6/b;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo6/a;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lo6/a;->documentTypeCase_:I

    return-void
.end method

.method private t0(Lo6/d;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo6/a;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lo6/a;->documentTypeCase_:I

    return-void
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lo6/a$a;->a:[I

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
    sget-object p1, Lo6/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lo6/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo6/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Lo6/a;->DEFAULT_INSTANCE:Lo6/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Lo6/a;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lo6/a;->DEFAULT_INSTANCE:Lo6/a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "documentType_"

    aput-object v0, p1, p3

    const-string p3, "documentTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lo6/b;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Ld7/i;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Lo6/d;

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "hasCommittedMutations_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007"

    sget-object p3, Lo6/a;->DEFAULT_INSTANCE:Lo6/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lo6/a$b;

    invoke-direct {p1, p3}, Lo6/a$b;-><init>(Lo6/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lo6/a;

    invoke-direct {p1}, Lo6/a;-><init>()V

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

.method public j0()Ld7/i;
    .locals 2

    iget v0, p0, Lo6/a;->documentTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo6/a;->documentType_:Ljava/lang/Object;

    check-cast v0, Ld7/i;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/i;->i0()Ld7/i;

    move-result-object v0

    return-object v0
.end method

.method public k0()Lo6/a$c;
    .locals 1

    iget v0, p0, Lo6/a;->documentTypeCase_:I

    invoke-static {v0}, Lo6/a$c;->b(I)Lo6/a$c;

    move-result-object v0

    return-object v0
.end method

.method public l0()Z
    .locals 1

    iget-boolean v0, p0, Lo6/a;->hasCommittedMutations_:Z

    return v0
.end method

.method public m0()Lo6/b;
    .locals 2

    iget v0, p0, Lo6/a;->documentTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo6/a;->documentType_:Ljava/lang/Object;

    check-cast v0, Lo6/b;

    return-object v0

    :cond_0
    invoke-static {}, Lo6/b;->h0()Lo6/b;

    move-result-object v0

    return-object v0
.end method

.method public n0()Lo6/d;
    .locals 2

    iget v0, p0, Lo6/a;->documentTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo6/a;->documentType_:Ljava/lang/Object;

    check-cast v0, Lo6/d;

    return-object v0

    :cond_0
    invoke-static {}, Lo6/d;->h0()Lo6/d;

    move-result-object v0

    return-object v0
.end method

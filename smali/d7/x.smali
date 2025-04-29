.class public final Ld7/x;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/x$b;,
        Ld7/x$j;,
        Ld7/x$g;,
        Ld7/x$i;,
        Ld7/x$k;,
        Ld7/x$f;,
        Ld7/x$d;,
        Ld7/x$h;,
        Ld7/x$c;,
        Ld7/x$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/x;",
        "Ld7/x$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ld7/x;

.field public static final END_AT_FIELD_NUMBER:I = 0x8

.field public static final FROM_FIELD_NUMBER:I = 0x2

.field public static final LIMIT_FIELD_NUMBER:I = 0x5

.field public static final OFFSET_FIELD_NUMBER:I = 0x6

.field public static final ORDER_BY_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/x;",
            ">;"
        }
    .end annotation
.end field

.field public static final SELECT_FIELD_NUMBER:I = 0x1

.field public static final START_AT_FIELD_NUMBER:I = 0x7

.field public static final WHERE_FIELD_NUMBER:I = 0x3


# instance fields
.field private endAt_:Ld7/h;

.field private from_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Ld7/x$c;",
            ">;"
        }
    .end annotation
.end field

.field private limit_:Lcom/google/protobuf/a0;

.field private offset_:I

.field private orderBy_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Ld7/x$i;",
            ">;"
        }
    .end annotation
.end field

.field private select_:Ld7/x$j;

.field private startAt_:Ld7/h;

.field private where_:Ld7/x$h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/x;

    invoke-direct {v0}, Ld7/x;-><init>()V

    sput-object v0, Ld7/x;->DEFAULT_INSTANCE:Ld7/x;

    const-class v1, Ld7/x;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    invoke-static {}, Lcom/google/protobuf/z;->H()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/x;->from_:Lcom/google/protobuf/d0$i;

    invoke-static {}, Lcom/google/protobuf/z;->H()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/x;->orderBy_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method public static C0()Ld7/x$b;
    .locals 1

    sget-object v0, Ld7/x;->DEFAULT_INSTANCE:Ld7/x;

    invoke-virtual {v0}, Lcom/google/protobuf/z;->B()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/x$b;

    return-object v0
.end method

.method private D0(Ld7/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/x;->endAt_:Ld7/h;

    return-void
.end method

.method private E0(Lcom/google/protobuf/a0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/x;->limit_:Lcom/google/protobuf/a0;

    return-void
.end method

.method private F0(Ld7/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/x;->startAt_:Ld7/h;

    return-void
.end method

.method private G0(Ld7/x$h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld7/x;->where_:Ld7/x$h;

    return-void
.end method

.method static synthetic e0()Ld7/x;
    .locals 1

    sget-object v0, Ld7/x;->DEFAULT_INSTANCE:Ld7/x;

    return-object v0
.end method

.method static synthetic f0(Ld7/x;Ld7/x$c;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x;->l0(Ld7/x$c;)V

    return-void
.end method

.method static synthetic g0(Ld7/x;Ld7/x$h;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x;->G0(Ld7/x$h;)V

    return-void
.end method

.method static synthetic h0(Ld7/x;Ld7/x$i;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x;->m0(Ld7/x$i;)V

    return-void
.end method

.method static synthetic i0(Ld7/x;Ld7/h;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x;->F0(Ld7/h;)V

    return-void
.end method

.method static synthetic j0(Ld7/x;Ld7/h;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x;->D0(Ld7/h;)V

    return-void
.end method

.method static synthetic k0(Ld7/x;Lcom/google/protobuf/a0;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/x;->E0(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private l0(Ld7/x$c;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ld7/x;->n0()V

    iget-object v0, p0, Ld7/x;->from_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private m0(Ld7/x$i;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ld7/x;->o0()V

    iget-object v0, p0, Ld7/x;->orderBy_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private n0()V
    .locals 2

    iget-object v0, p0, Ld7/x;->from_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/z;->R(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/x;->from_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method private o0()V
    .locals 2

    iget-object v0, p0, Ld7/x;->orderBy_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/z;->R(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ld7/x;->orderBy_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static p0()Ld7/x;
    .locals 1

    sget-object v0, Ld7/x;->DEFAULT_INSTANCE:Ld7/x;

    return-object v0
.end method


# virtual methods
.method public A0()Z
    .locals 1

    iget-object v0, p0, Ld7/x;->startAt_:Ld7/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public B0()Z
    .locals 1

    iget-object v0, p0, Ld7/x;->where_:Ld7/x$h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

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
    sget-object p1, Ld7/x;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/x;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/x;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/x;->DEFAULT_INSTANCE:Ld7/x;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/x;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ld7/x;->DEFAULT_INSTANCE:Ld7/x;

    return-object p1

    :pswitch_4
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "select_"

    aput-object v0, p1, p3

    const-string p3, "from_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Ld7/x$c;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "where_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "orderBy_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Ld7/x$i;

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "limit_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "offset_"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "startAt_"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "endAt_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0008\u0000\u0000\u0001\u0008\u0008\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\u0008\t"

    sget-object p3, Ld7/x;->DEFAULT_INSTANCE:Ld7/x;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/x$b;

    invoke-direct {p1, p3}, Ld7/x$b;-><init>(Ld7/x$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/x;

    invoke-direct {p1}, Ld7/x;-><init>()V

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

.method public q0()Ld7/h;
    .locals 1

    iget-object v0, p0, Ld7/x;->endAt_:Ld7/h;

    if-nez v0, :cond_0

    invoke-static {}, Ld7/h;->k0()Ld7/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public r0(I)Ld7/x$c;
    .locals 1

    iget-object v0, p0, Ld7/x;->from_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld7/x$c;

    return-object p1
.end method

.method public s0()I
    .locals 1

    iget-object v0, p0, Ld7/x;->from_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public t0()Lcom/google/protobuf/a0;
    .locals 1

    iget-object v0, p0, Ld7/x;->limit_:Lcom/google/protobuf/a0;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/a0;->g0()Lcom/google/protobuf/a0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public u0(I)Ld7/x$i;
    .locals 1

    iget-object v0, p0, Ld7/x;->orderBy_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld7/x$i;

    return-object p1
.end method

.method public v0()I
    .locals 1

    iget-object v0, p0, Ld7/x;->orderBy_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public w0()Ld7/h;
    .locals 1

    iget-object v0, p0, Ld7/x;->startAt_:Ld7/h;

    if-nez v0, :cond_0

    invoke-static {}, Ld7/h;->k0()Ld7/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public x0()Ld7/x$h;
    .locals 1

    iget-object v0, p0, Ld7/x;->where_:Ld7/x$h;

    if-nez v0, :cond_0

    invoke-static {}, Ld7/x$h;->j0()Ld7/x$h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public y0()Z
    .locals 1

    iget-object v0, p0, Ld7/x;->endAt_:Ld7/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z0()Z
    .locals 1

    iget-object v0, p0, Ld7/x;->limit_:Lcom/google/protobuf/a0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

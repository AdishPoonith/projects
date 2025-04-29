.class public Lkotlinx/coroutines/scheduling/f;
.super Lla/m1;
.source "SourceFile"


# instance fields
.field private final m:I

.field private final n:I

.field private final o:J

.field private final p:Ljava/lang/String;

.field private q:Lkotlinx/coroutines/scheduling/a;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lla/m1;-><init>()V

    iput p1, p0, Lkotlinx/coroutines/scheduling/f;->m:I

    iput p2, p0, Lkotlinx/coroutines/scheduling/f;->n:I

    iput-wide p3, p0, Lkotlinx/coroutines/scheduling/f;->o:J

    iput-object p5, p0, Lkotlinx/coroutines/scheduling/f;->p:Ljava/lang/String;

    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/f;->k0()Lkotlinx/coroutines/scheduling/a;

    move-result-object p1

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/f;->q:Lkotlinx/coroutines/scheduling/a;

    return-void
.end method

.method private final k0()Lkotlinx/coroutines/scheduling/a;
    .locals 7

    new-instance v6, Lkotlinx/coroutines/scheduling/a;

    iget v1, p0, Lkotlinx/coroutines/scheduling/f;->m:I

    iget v2, p0, Lkotlinx/coroutines/scheduling/f;->n:I

    iget-wide v3, p0, Lkotlinx/coroutines/scheduling/f;->o:J

    iget-object v5, p0, Lkotlinx/coroutines/scheduling/f;->p:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/scheduling/a;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public h0(Lv9/g;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/f;->q:Lkotlinx/coroutines/scheduling/a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/scheduling/a;->k(Lkotlinx/coroutines/scheduling/a;Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;ZILjava/lang/Object;)V

    return-void
.end method

.method public final l0(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/f;->q:Lkotlinx/coroutines/scheduling/a;

    invoke-virtual {v0, p1, p2, p3}, Lkotlinx/coroutines/scheduling/a;->i(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V

    return-void
.end method

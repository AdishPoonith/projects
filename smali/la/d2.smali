.class public final Lla/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlinx/coroutines/internal/b0;

.field public static final b:Lkotlinx/coroutines/internal/b0;

.field private static final c:Lkotlinx/coroutines/internal/b0;

.field private static final d:Lkotlinx/coroutines/internal/b0;

.field private static final e:Lkotlinx/coroutines/internal/b0;

.field private static final f:Lla/f1;

.field private static final g:Lla/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/b0;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lla/d2;->a:Lkotlinx/coroutines/internal/b0;

    new-instance v0, Lkotlinx/coroutines/internal/b0;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lla/d2;->b:Lkotlinx/coroutines/internal/b0;

    new-instance v0, Lkotlinx/coroutines/internal/b0;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lla/d2;->c:Lkotlinx/coroutines/internal/b0;

    new-instance v0, Lkotlinx/coroutines/internal/b0;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lla/d2;->d:Lkotlinx/coroutines/internal/b0;

    new-instance v0, Lkotlinx/coroutines/internal/b0;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lla/d2;->e:Lkotlinx/coroutines/internal/b0;

    new-instance v0, Lla/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lla/f1;-><init>(Z)V

    sput-object v0, Lla/d2;->f:Lla/f1;

    new-instance v0, Lla/f1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lla/f1;-><init>(Z)V

    sput-object v0, Lla/d2;->g:Lla/f1;

    return-void
.end method

.method public static final synthetic a()Lkotlinx/coroutines/internal/b0;
    .locals 1

    sget-object v0, Lla/d2;->a:Lkotlinx/coroutines/internal/b0;

    return-object v0
.end method

.method public static final synthetic b()Lkotlinx/coroutines/internal/b0;
    .locals 1

    sget-object v0, Lla/d2;->c:Lkotlinx/coroutines/internal/b0;

    return-object v0
.end method

.method public static final synthetic c()Lla/f1;
    .locals 1

    sget-object v0, Lla/d2;->g:Lla/f1;

    return-object v0
.end method

.method public static final synthetic d()Lla/f1;
    .locals 1

    sget-object v0, Lla/d2;->f:Lla/f1;

    return-object v0
.end method

.method public static final synthetic e()Lkotlinx/coroutines/internal/b0;
    .locals 1

    sget-object v0, Lla/d2;->e:Lkotlinx/coroutines/internal/b0;

    return-object v0
.end method

.method public static final synthetic f()Lkotlinx/coroutines/internal/b0;
    .locals 1

    sget-object v0, Lla/d2;->d:Lkotlinx/coroutines/internal/b0;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lla/q1;

    if-eqz v0, :cond_0

    new-instance v0, Lla/r1;

    check-cast p0, Lla/q1;

    invoke-direct {v0, p0}, Lla/r1;-><init>(Lla/q1;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lla/r1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lla/r1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lla/r1;->a:Lla/q1;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method

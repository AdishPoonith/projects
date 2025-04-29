.class public abstract Lla/g0;
.super Lv9/a;
.source "SourceFile"

# interfaces
.implements Lv9/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lla/g0$a;
    }
.end annotation


# static fields
.field public static final k:Lla/g0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lla/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lla/g0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lla/g0;->k:Lla/g0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lv9/e;->h:Lv9/e$b;

    invoke-direct {p0, v0}, Lv9/a;-><init>(Lv9/g$c;)V

    return-void
.end method


# virtual methods
.method public b(Lv9/g$c;)Lv9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lv9/g$b;",
            ">(",
            "Lv9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lv9/e$a;->a(Lv9/e;Lv9/g$c;)Lv9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lv9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "*>;)V"
        }
    .end annotation

    check-cast p1, Lkotlinx/coroutines/internal/f;

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/f;->s()V

    return-void
.end method

.method public f0(Lv9/g$c;)Lv9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/g$c<",
            "*>;)",
            "Lv9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lv9/e$a;->b(Lv9/e;Lv9/g$c;)Lv9/g;

    move-result-object p1

    return-object p1
.end method

.method public final g0(Lv9/d;)Lv9/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv9/d<",
            "-TT;>;)",
            "Lv9/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/internal/f;

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/f;-><init>(Lla/g0;Lv9/d;)V

    return-object v0
.end method

.method public abstract h0(Lv9/g;Ljava/lang/Runnable;)V
.end method

.method public i0(Lv9/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public j0(I)Lla/g0;
    .locals 1

    invoke-static {p1}, Lkotlinx/coroutines/internal/l;->a(I)V

    new-instance v0, Lkotlinx/coroutines/internal/k;

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/k;-><init>(Lla/g0;I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lla/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lla/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

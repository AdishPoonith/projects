.class final Loa/a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loa/a;->a(Loa/c;Lv9/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.flow.AbstractFlow"
    f = "Flow.kt"
    l = {
        0xe6
    }
    m = "collect"
.end annotation


# instance fields
.field j:Ljava/lang/Object;

.field synthetic k:Ljava/lang/Object;

.field final synthetic l:Loa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loa/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field m:I


# direct methods
.method constructor <init>(Loa/a;Lv9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loa/a<",
            "TT;>;",
            "Lv9/d<",
            "-",
            "Loa/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loa/a$a;->l:Loa/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lv9/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Loa/a$a;->k:Ljava/lang/Object;

    iget p1, p0, Loa/a$a;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Loa/a$a;->m:I

    iget-object p1, p0, Loa/a$a;->l:Loa/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Loa/a;->a(Loa/c;Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.class final Lv9/c$c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv9/c;->writeReplace()Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lda/p<",
        "Ls9/u;",
        "Lv9/g$b;",
        "Ls9/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic j:[Lv9/g;

.field final synthetic k:Lkotlin/jvm/internal/r;


# direct methods
.method constructor <init>([Lv9/g;Lkotlin/jvm/internal/r;)V
    .locals 0

    iput-object p1, p0, Lv9/c$c;->j:[Lv9/g;

    iput-object p2, p0, Lv9/c$c;->k:Lkotlin/jvm/internal/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls9/u;Lv9/g$b;)V
    .locals 3

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "element"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lv9/c$c;->j:[Lv9/g;

    iget-object v0, p0, Lv9/c$c;->k:Lkotlin/jvm/internal/r;

    iget v1, v0, Lkotlin/jvm/internal/r;->j:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v0, Lkotlin/jvm/internal/r;->j:I

    aput-object p2, p1, v1

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls9/u;

    check-cast p2, Lv9/g$b;

    invoke-virtual {p0, p1, p2}, Lv9/c$c;->a(Ls9/u;Lv9/g$b;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method

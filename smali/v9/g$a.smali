.class public final Lv9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lv9/g;Lv9/g;)Lv9/g;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv9/h;->j:Lv9/h;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lv9/g$a$a;->j:Lv9/g$a$a;

    invoke-interface {p1, p0, v0}, Lv9/g;->N(Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv9/g;

    :goto_0
    return-object p0
.end method

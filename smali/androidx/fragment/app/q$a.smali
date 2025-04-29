.class Landroidx/fragment/app/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/x$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/lifecycle/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    new-instance p1, Landroidx/fragment/app/q;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroidx/fragment/app/q;-><init>(Z)V

    return-object p1
.end method

.method public synthetic b(Ljava/lang/Class;Lc0/a;)Landroidx/lifecycle/w;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/lifecycle/y;->b(Landroidx/lifecycle/x$b;Ljava/lang/Class;Lc0/a;)Landroidx/lifecycle/w;

    move-result-object p1

    return-object p1
.end method

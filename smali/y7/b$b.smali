.class public final Ly7/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/b;->i(Lr8/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly7/b;


# direct methods
.method constructor <init>(Ly7/b;)V
    .locals 0

    iput-object p1, p0, Ly7/b$b;->a:Ly7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lr8/d$b;)V
    .locals 0

    iget-object p1, p0, Ly7/b$b;->a:Ly7/b;

    invoke-static {p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Ly7/b;->a(Ly7/b;Lr8/d$b;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Ly7/b$b;->a:Ly7/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ly7/b;->a(Ly7/b;Lr8/d$b;)V

    return-void
.end method

.class public final synthetic Lp1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/d$a;


# instance fields
.field public final synthetic a:Lp1/e0;

.field public final synthetic b:Lp0/p;


# direct methods
.method public synthetic constructor <init>(Lp1/e0;Lp0/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/c0;->a:Lp1/e0;

    iput-object p2, p0, Lp1/c0;->b:Lp0/p;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/content/Intent;)Z
    .locals 2

    iget-object v0, p0, Lp1/c0;->a:Lp1/e0;

    iget-object v1, p0, Lp1/c0;->b:Lp0/p;

    invoke-static {v0, v1, p1, p2}, Lp1/e0;->c(Lp1/e0;Lp0/p;ILandroid/content/Intent;)Z

    move-result p1

    return p1
.end method

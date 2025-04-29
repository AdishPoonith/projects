.class public final synthetic Lp1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/d$a;


# instance fields
.field public final synthetic a:Lp1/e0;


# direct methods
.method public synthetic constructor <init>(Lp1/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/b0;->a:Lp1/e0;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/content/Intent;)Z
    .locals 1

    iget-object v0, p0, Lp1/b0;->a:Lp1/e0;

    invoke-static {v0, p1, p2}, Lp1/e0;->b(Lp1/e0;ILandroid/content/Intent;)Z

    move-result p1

    return p1
.end method

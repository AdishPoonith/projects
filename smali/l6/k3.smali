.class public final synthetic Ll6/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Lq6/n;


# direct methods
.method public synthetic constructor <init>(Lq6/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/k3;->a:Lq6/n;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll6/k3;->a:Lq6/n;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Ll6/y3;->h(Lq6/n;Landroid/database/Cursor;)V

    return-void
.end method

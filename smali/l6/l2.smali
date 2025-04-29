.class public final synthetic Ll6/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/s2;


# direct methods
.method public synthetic constructor <init>(Ll6/s2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/l2;->a:Ll6/s2;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll6/l2;->a:Ll6/s2;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Ll6/s2;->m(Ll6/s2;Landroid/database/Cursor;)V

    return-void
.end method

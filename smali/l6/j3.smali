.class public final synthetic Ll6/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/y3;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll6/y3;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/j3;->a:Ll6/y3;

    iput-object p2, p0, Ll6/j3;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ll6/j3;->a:Ll6/y3;

    iget-object v1, p0, Ll6/j3;->b:Ljava/lang/String;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Ll6/y3;->p(Ll6/y3;Ljava/lang/String;Landroid/database/Cursor;)V

    return-void
.end method

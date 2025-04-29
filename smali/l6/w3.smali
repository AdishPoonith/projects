.class public final synthetic Ll6/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/t0$a;

.field public final synthetic b:Landroid/database/sqlite/SQLiteStatement;


# direct methods
.method public synthetic constructor <init>(Ll6/t0$a;Landroid/database/sqlite/SQLiteStatement;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/w3;->a:Ll6/t0$a;

    iput-object p2, p0, Ll6/w3;->b:Landroid/database/sqlite/SQLiteStatement;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ll6/w3;->a:Ll6/t0$a;

    iget-object v1, p0, Ll6/w3;->b:Landroid/database/sqlite/SQLiteStatement;

    check-cast p1, Lm6/u;

    invoke-static {v0, v1, p1}, Ll6/y3;->f(Ll6/t0$a;Landroid/database/sqlite/SQLiteStatement;Lm6/u;)V

    return-void
.end method

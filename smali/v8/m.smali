.class public final synthetic Lv8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw8/o$a;


# instance fields
.field public final synthetic a:Lv8/w;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv8/w;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/m;->a:Lv8/w;

    iput-object p2, p0, Lv8/m;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/firestore/d1;)V
    .locals 2

    iget-object v0, p0, Lv8/m;->a:Lv8/w;

    iget-object v1, p0, Lv8/m;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lv8/w;->z(Lv8/w;Ljava/lang/String;Lcom/google/firebase/firestore/d1;)V

    return-void
.end method
